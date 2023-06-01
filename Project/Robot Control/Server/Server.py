from flask import Flask

app = Flask(__name__)

@app.route('/test')
def test():
	return 'Hello World'	

app.run(host='localhost', port=5000)