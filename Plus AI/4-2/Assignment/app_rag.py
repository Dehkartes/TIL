import bs4
from langchain import hub
from langchain_chroma import Chroma
from langchain_openai import ChatOpenAI
from langchain_openai import OpenAIEmbeddings
from langchain_community.document_loaders import WebBaseLoader
from langchain_text_splitters import RecursiveCharacterTextSplitter
import streamlit as st

llm = ChatOpenAI(model="gpt-4o-mini")

loader = WebBaseLoader(
    web_paths=("https://spartacodingclub.kr/blog/all-in-challenge_winner",),
    bs_kwargs=dict(
        parse_only=bs4.SoupStrainer(
            class_=("editedContent", "css-j3idia")
        )
    ),
)
docs = loader.load()

text_splitter = RecursiveCharacterTextSplitter(
    chunk_size=1000, 
    chunk_overlap=200
)
splits = text_splitter.split_documents(docs)
vectorstore = Chroma.from_documents(
    documents=splits, 
    embedding=OpenAIEmbeddings()
)

retriever = vectorstore.as_retriever()

user_msg = "What is Task Decomposition?"
retrieved_docs = retriever.invoke(user_msg)

def format_docs(docs):
    return "\n\n".join(doc.page_content for doc in docs)
prompt = hub.pull("rlm/rag-prompt")

user_prompt = prompt.invoke({"context": format_docs(retrieved_docs), "question": user_msg})
print(user_prompt)

response = llm.invoke(user_prompt)
print(response.content)

st.title("HF Bot")

if "messages" not in st.session_state:
    st.session_state.messages = []

for m in st.session_state["messages"]:
    with st.chat_message(m["role"]):
        st.markdown(m["content"])