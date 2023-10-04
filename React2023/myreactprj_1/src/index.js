import React from 'react';
import ReactDOM from 'react-dom/client';

const SideMenu = (props) => {
  console.log(props.showMenu);
  return(
    <>
      <div
        style={{
          border:'1px solid rgba(244, 67, 54, 1.0)',
          width:'200px',
          height:'94vh', // viewport height, vw : viewport width,
          padding:'10px',
          textAlign:props.direction

        }}>
        {props.direction}
        <ul style={{listStyle:'none', paddingLeft:'0px', lineHeight:'2.6rem'}}>
          <li>Lorem.</li>
          <li>Saepe.</li>
          <li>Delectus?</li>
          <li>Dolorum.</li>
          <li>Perferendis.</li>
          <li>Corporis.</li>
          <li>Quas?</li>
          <li>Culpa?</li>
          <li>Tempore.</li>
          <li>Iure!</li>
          <li>Sapiente.</li>
          <li>Velit!</li>
          <li>Quaerat.</li>
          <li>Eligendi!</li>
          <li>Dolor.</li>
        </ul>


      </div>
    </>
  )
}

const App = (props) =>{
  // const showMenu = props.showMenu;
  const {showMenu} = props;

  return(
    <>
      {showMenu && <SideMenu direction = 'left'/>}
    </>
  );
}

ReactDOM.createRoot(document.querySelector('#root')).render(
  <>
    <App showMenu={true}/>
  </>
);