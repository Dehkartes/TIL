import express from 'express';


app.get('/', (req, res) => {
	res.send('Hello World!');
});

// /input/test
app.get("/input/:name", (req, res) => {
	const person = req.params
	res.json({'name': person.name})
})

// /input?name=test&age=3
app.get("/input", (req, res) => {
	const person = req.query
	res.json({'name': person.name,
		'age': person.age
	})
})

app.listen(port, () => {
	console.log(`App running on port ${port}...`)
});