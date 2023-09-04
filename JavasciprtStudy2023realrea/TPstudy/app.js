import { PrismaClient } from '@prisma/client';
import express from 'express';
import path from 'path';
import signupRouter from './router/signup.js'; // 회원가입 기능 구현
import loginRouter from './router/login.js'; // 로그인 기능 구현

const prisma = new PrismaClient();

// express 는 함수이므로, 반환값을 변수에 저장한다.
const app = express();
const router = express.Router(); // 라우터 생성

//__dirname을 path.dirname(import.meta.url)로 대체한다
const __dirname = path.resolve();

// index.html 파일 라우팅
router.get('/', function(req, res) {
  const filePath = path.join(__dirname, 'public', 'index.html');
  res.sendFile(filePath);
}); 

// public 디렉토리를 static으로 기억한다.
app.use(express.static(path.join(__dirname, 'public')));
app.use(express.urlencoded({ extended: true }));

app.use('/signup', signupRouter); // 회원가입 라우터 등록
app.use('/login',loginRouter); // 로그인 라우터 등록
app.use('/', router); // 루트 경로에 router 를 등록

// 3000 포트로 서버 오픈
app.listen(3000, function() {
  console.log("start! express server on port 3000");
});
