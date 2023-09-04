import express from 'express';
import { PrismaClient } from '@prisma/client';
import { hashing } from '../utils/hashing.js';

const prisma = new PrismaClient();
const router = express.Router();

// index.html 파일에서 아이디 중복체크 값 라우팅
router.get('/check-username', async (req, res) => {
  const { signupUsername } = req.query;
  const account = await prisma.account.findFirst({
    where: { userId: signupUsername },
  });

  if (account !== null) {
    res.json({ exists: true });
  } else {
    res.json({ exists: false });
  }
});

// index.html 파일에서 닉네임 중복체크 값 라우팅
router.get('/check-nickname', async (req, res) => {
  const { nickname } = req.query;
  const account = await prisma.account.findUnique({
      where: { nickname },
  });
  if (account !== null) {
    res.json({ exists: true });
  } else {
    res.json({ exists: false });
  }
});


// /signup 경로의 POST 요청을 처리할 수 있는 코드
router.post('/', async (req, res) => {
  const { signupUsername, password, nickname } = req.body;

  try {
    await prisma.account.create({
      data: {
        userId: signupUsername,
        userPassword: hashing(password),
        nickname: nickname,
      },
    });
    // 이상이 없는 경우에만 클라이언트로 리다이렉션 요청
    const message = '가입 되셨습니다.';
    res.send(`<script type="text/javascript">alert("${message}"); window.location.href = '/';</script>`);
  } catch (error) {
    const message = '닉네임이 중복됩니다.';
    res.json({       data: {
      userId: signupUsername,
      userPassword: hashing(password),
      nickname: nickname,
    }, })
  }
});

export default router;
