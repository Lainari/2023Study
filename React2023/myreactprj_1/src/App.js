import './App.css';
import Example1 from './components/Example1.js'
import Box from './components/Box';
import Box1 from './components/Box1';
import Box2 from './components/Box2';
import CoupangBox from './components/CoupangBox';


function App() {
  // 작업처리
  return (
    // JSX
    <div className='App'>
      <h1>⛔일본 IT과 AI소프트웨어반(2JI-A) 홈페이지⛔</h1>
      <Example1/>
      <Box name='붉은 상자' color='red'/>
      <Box name='녹색 상자' color='green'/>
      <Box name='푸른 상자' color='#0000FF'/>
      <Box name='무슨 색일까요?' color='rgba(255,140,45,0.7)'/>
      <Box name='무슨 색일까요?' color='rgba(255,0,0,0.2)'/>
      <Box />
      <hr/>
      <Box1 name='무명상자' color='cyan'>
        내용입니다
        <p>칠드런</p>
      </Box1>
      <hr/>
      <Box2 name='구조분해할당' color='rgba(255,85,51,0.9)'></Box2>
      <hr/>
      <CoupangBox name='라면' imgUrl='./ramen.jpg'/>
    </div>
  );
}

export default App;
