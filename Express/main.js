// app.js
import express from 'express';
import mongoose from 'mongoose';
import bodyParser from 'body-parser';
import userRoutes from './route/userRoute.js';

const app = express();
const port = process.env.PORT || 3000;

// MongoDB 연결 URL
const uri = 'mongodb://root:password@localhost:27017';

mongoose.connect(uri, {
	dbName: "default"
})
.then(() => {
	console.log('MongoDB에 성공적으로 연결되었습니다.');
})
.catch((err) => {
	console.error('MongoDB 연결 오류:', err);
});

app.use(bodyParser.json());
app.use('/', userRoutes);

app.listen(port, () => {
	console.log(`서버가 http://localhost:${port} 에서 실행 중입니다.`);
});
