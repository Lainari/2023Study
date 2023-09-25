// import React from 'react';
// import ReactDOM from 'react-dom/client';
// import './index.css';
// import App from './App_propsValidation';
// // import App from './App';
// // import App from './App.js;' 위 소스코드와 같은 효과

// /* 뭐야 JS 주석이 이런데... */

// const root = ReactDOM.createRoot(document.querySelector('#root'));
// root.render(
//   // JSX 문법
//   <>
//     <App/>
//     {/* 같은 효과를 주는 <App/> 와 <App></App>*/}
//     {/* 이건 JSX 주석!! */}
//   </>
//   // <> ... </> 안에 있는 컨포넌트 내용을 묶을 수 있는 장점으로 만들 수 있다!
// );
import React from 'react';
import ReactDOM from 'react-dom/client';
import PropTypes from 'prop-types';

const SomeComponent = (props)=>{
  // return(<>{props.data[2]}</>);
  return(
  <div>
    {/* <input type='text' value = {props.searchText}/>   value - html OK, jsx - X
    jsx - defaultValue를 사용하여 input의 value 값을 지정*/}
    {/* <input type='text' defaultValue = {props.searchText}/> */}
    <input
      type = 'text'
      defaultValue={props.data[2]}
      style={
        {
          marginTop:'50px',
          marginLeft:'50px',
          marginRight:'10px',
          marginBottom:'10px',
          padding:'25px',
          borderRadius:'4px',
          border:'1px solid #f75211',
        }
      }
    />
    <span>{typeof(props.data[2])}</span>
  </div>);
}

SomeComponent.propTypes = {
  data:PropTypes.arrayOf(
    PropTypes.oneOfType([PropTypes.string, PropTypes.number, PropTypes.bool]) // 배열 안에 있는 데이터가 문자 또는 숫자인 것만 검색
  )
  // searchText:PropTypes.oneOf(['male', 'female'])
};

// ReactDOM.createRoot(document.getElementById('root')).render(
ReactDOM.createRoot(document.querySelector('#root')).render(
    <>
      {/* <h1>헬로</h1> */}
      {/* <SomeComponent data={[1, 2, '3', 4, 5]} /> */}
      {/* props로 배열전달시 {배열명} */}
      {/* <SomeComponent searchText='female' />
      <SomeComponent searchText='abc' /> */}
      <SomeComponent data={[1, 2, 3, 4, 5]}/>
      <SomeComponent data={['1', '2', '3', '4', '5']}/>
      <SomeComponent data={['japan', 1, 'korea', 2, true]}/>
    </>
);