// const mysql = require('mysql');

// // RDS 연결 정보
// const connection = mysql.createConnection({
//     host: '35.193.15.93',
//     user: 'fukufuku',
//     password: '2jiateam3',
//     database: 'fukufuku'
// });

// // MySQL 연결 확인
// connection.connect((err) => {
//   if (err) {
//     console.error('Error connecting to MySQL database:', err);
//   } else {
//     console.log('Connected to MySQL database');
//     // DB 연결 확인을 위해 SELECT 1 쿼리 실행
//     connection.query('SELECT 1', (err, result) => {
//       if (err) {
//         console.error('Error executing query:', err);
//       } else {
//         console.log('DB query result:', result);
//       }
//     });
//   }
// });