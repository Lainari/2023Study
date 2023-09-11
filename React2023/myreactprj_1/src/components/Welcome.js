// [1] function 컴포넌트명(props){ return 결과; }

// function Welcome(){
//     // JSX
//     return <p>안녕하세요? 일본IT과 여러분!</p>;



//     // return 결과값;

// }

// export default Welcome;

// [2] const 컴포넌트명 = function(props){}
// const Welcome = function() {
//     return <p>Welcome to Korea</p>
// }

// export default Welcome;


// [3] const 컴포넌트명 = (props) => {return ;}
// const Welcome = ()=>{
//     return <p>Welcome to Korea!</p>
// }


// export default Welcome;

// export default const Welcome = ()=> {return;}; // 에러 발생
// [1] 방식으로 맨 마지막 코드를 통합해서 정의
// [4] export default function 컴포넌트명(props){return 결과;}

export default function Welcome({city, population}){ // props : 부모컴포넌트로부터 전달받은 재료
    // console.log(data);
    // console.log(typeof(data));

    // return <p>Welcome to Korea!!</p>
    return <>
        {/* JSX내에서 {} 내부는 JS 소스코드 */}
        <p>Welcome to {city} (인구수: {population}만명)</p>
    </>
}