import express from 'express';
import { PrismaClient } from '@prisma/client';
import { hashing } from '../utils/hashing.js';

const prisma = new PrismaClient();
const router = express.Router();

  
  // /login 경로의 POST 요청을 처리할 수 있는 코드
  router.post('/', async (req, res) => {
    const { username, password} = req.body;
    console.log(username,password);
  
    try {
      const account = await prisma.account.findFirst({
        where: {
          userId: username
        },
      });
      if (account) {
        console.log(account)
        console.log(hashing(password))
        if (account.userPassword !== hashing(password)) {
          console.error('error');
          return 1;
        }
        // 이상이 없는 경우에만 클라이언트로 리다이렉션 요청
        const message = `로그인 성공! 환영합니다 ${account.userId}님!`;

        // 회원의 닉네임과 관리자 여부 값을 반환
        const userData = {
            nickname: account.nickname,
            isAdmin: account.isAdmin,
          };
          res.json({
            message,
            userData,
          });
        // 확인용으로만 send + window 문법 사용한거 || 추후 프론트에서 json 값을 통해 구현해주세요.
        // res.send(`<script type="text/javascript">alert("${message}"); window.location.href = '/';</script>`);
      } else {
        const message = '로그인 실패, 다시 한 번 정보를 입력해주세요';
        // res.send(`<script type="text/javascript">alert("${message}"); window.location.href = '/';</script>`);
      }
    } catch (error) {
      console.error(error);
      const message = '로그인 중에 오류가 발생했습니다,'
    //   res.send(`<script type="text/javascript">alert("${message}"); window.location.href = '/';</script>`);
    }
  });

export default router;