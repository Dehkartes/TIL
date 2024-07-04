from selenium import webdriver
import datetime

driver = webdriver.Chrome('./chromedriver')
driver.implicitly_wait(1)
driver.get('https://category.gmarket.co.kr/listview/L100000074.aspx')

table = driver.find_element_by_xpath("//*[@id=\"cppLargeCategoryBest\"]")

strList = table.text.split("\n")

data = {}
key = ""
for i in strList:
	if i[0] == "[":
		key = i
		data[key] = ""
	elif i[-1] == "원":
		data[key] = i

for k, v in data.items():
	print(k, v)