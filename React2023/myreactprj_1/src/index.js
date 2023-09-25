import props from 'prop-types';
import React from 'react';
import ReactDOM from 'react-dom/client';

// 옛날 방식
// const name = 'SEOK';
// const element = <h1>안녕하세요? {name}</h1>;

// ReactDOM.render(
//   element,
//   document.querySelector('#root') // 표시될 위치
// );

// 최신방식
// const name = 'SEOK';
// const element = <h1>안녕하세요? {name}</h1>;
// ReactDOM.createRoot(document.querySelector('#root')).render(
  //   <>{element}</>
// );
// );




const person = {
 name:'JINSEOK',
 address:'Daegu',
 age:23
}

const name = 'SEOK';
function printPerson(person){
  const {name, address,age} = person;
  return (`${name} 입니다. ${address}에서 살고, 나이는 ${age}살 입니다.`)
}
const element = <h1>안녕하세요? {printPerson(person)}</h1>;


const App = (props)=>{
  return(
    <>
      name
      <hr />
      {name}
      <hr />
      {element}
    </>
  )
};
ReactDOM.createRoot(document.querySelector('#root')).render(
  <>{element}</>
  // <App />
  // 3+4
  // person.age + 10

);