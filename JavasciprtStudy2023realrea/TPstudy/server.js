const express = require('express');
const multer = require('multer');
const path = require('path');

const app = express();
const mysql = require('mysql');

// // MySQL 연결 설정
// const connection = mysql.createConnection({
//   host: '35.193.15.93',
//   user: 'fukufuku',
//   password: '2jiateam3',
//   database: 'fukufuku'
// });

// // MySQL 연결 확인
// connection.connect((err) => {
//   if (err) {
//     console.error('Error connecting to MySQL database:', err);
//   } else {
//     console.log('Connected to MySQL database');
//   }
// });


// 이미지를 저장할 uploads 폴더 설정
const storage = multer.diskStorage({
  destination: function(req, file, cb) {
    cb(null, 'uploads/');
  },
  filename: function(req, file, cb) {
    // 파일명 중복 방지를 위해 고유한 파일명 생성
    const uniqueSuffix = Date.now() + '-' + Math.round(Math.random() * 1E9);
    cb(null, file.fieldname + '-' + uniqueSuffix + path.extname(file.originalname));
  }
});

// 업로드할 이미지를 처리하는 미들웨어 설정
const upload = multer({ storage: storage });

// 정적 파일 제공
app.use(express.static(__dirname));

// index.html 파일에 대한 라우트
app.get('/', function(req, res) {
  res.sendFile(__dirname + '/index.html');
});

// 이미지를 업로드하는 엔드포인트
app.post('/upload', upload.single('image'), function(req, res) {
  if (!req.file) {
    return res.status(400).send('No files were uploaded.');
  }

  const imageUrl = 'http://35.193.15.93' + req.file.filename; // 실제 이미지 URL

  // 이미지 URL을 데이터베이스에 저장
  const insertQuery = `INSERT INTO imageSave (fileName) VALUES (?)`;
  connection.query(insertQuery, [imageUrl], (err) => {
    if (err) {
      console.error('Error saving image URL:', err);
      return res.status(500).send('An error occurred while saving the image URL.');
    }

    res.send(imageUrl);
  });
});

// 서버를 3000 포트에서 실행
app.listen(3000, function() {
  console.log('Server started on port 3000');
});
