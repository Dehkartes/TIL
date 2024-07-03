import mongoose from "mongoose";
const { Schema } = mongoose; //객체 구조 분해 할당

const userSchema = new Schema({
	name: {
		type: String,
		required: true, // null 여부
		unique: true, // 유니크 여부
	},
	age: {
		type: Number,
		required: true,
	}
});

export default mongoose.model('User', userSchema, 'User');