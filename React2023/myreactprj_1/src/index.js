import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
// import App from './App.js;' 위 소스코드와 같은 효과

/* 뭐야 JS 주석이 이런데... */

const root = ReactDOM.createRoot(document.querySelector('#root'));
root.render(
  // JSX 문법
  <>
    <App/>
    {/* 같은 효과를 주는 <App/> 와 <App></App>*/}
    {/* 이건 JSX 주석!! */}
  </>
  // <> ... </> 안에 있는 컨포넌트 내용을 묶을 수 있는 장점으로 만들 수 있다!
);