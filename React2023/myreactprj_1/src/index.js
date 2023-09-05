import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
// import App from './App.js;' 위 소스코드와 같은 효과

const root = ReactDOM.createRoot(document.querySelector('#root'));
root.render(
  <>
    <App/>
    {/* <App></App> 위에거랑 같은 효과*/} {/*주석처리~*/}
  </>
  // <> ... </> 안에 있는 컨포넌트 내용을 묶을 수 있는 장점으로 만들 수 있다!
);