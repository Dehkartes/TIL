from flask import Flask, request

app = Flask(__name__)

@app.route('/test')
def test():
	print('testcalled')
	return 'Hello World'

@app.route('/param', methods=['POST'])
def name():
    return request.get_data()
    return request.get_data().decode('utf-8')

app.run(host='localhost', port=5000)