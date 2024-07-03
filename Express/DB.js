import mongoose from 'mongoose';
import User from "./schemas/user.js";

mongoose.connect("mongodb://root:password@localhost:27017", {
	dbName: "default"
});
let db = mongoose.connection;

db.on('error', () => {
	console.log('Connection Failed!');
});

db.once('open', () => {
	console.log('Connected!')
})

// 10. Student 레퍼런스 전체 데이터 가져오기
async function getUserList() {
	const userList = await User.find({});
	console.log(userList);
}

getUserList();

export async function createUser(name, address, age) {
	let userSchema = new mongoose.Schema({
		name: 'string',
		address: 'string',
		age: 'number'
	})

	let User = mongoose.model('user', userSchema, 'User');
	
	let user1 = new User({name: name, address: address, age: age});
	const result = await user1.save();
}

// export async function findUserByName(name) {
// 	let user = await User.find
// }

createUser("se", "a3", 5)