// import { Fragment } from "react";
import { Fragment } from "react";
import Welcome from "./Welcome";

function Example1(){
    // return (<h2 style='border: 1px solid'>열심히 React 해보는 시간</h2>); 에러발생
    // return (<div>열심히 React 해보는 시간</div>);
    // return (
    //     <Fragment>
    //         열심히 React 해보는 시간
    //     </Fragment>
    // );
    // return <h2>열심히 React 해보는 시간</h2>; // 한 줄일 때는 () 생략 가능
    return(
    // <><h2>일본 후쿠오카현 텐진석씨</h2></>
    // <Fragment></Fragment>
    <>
    {/* JSX 주석문 */}
        <Welcome city='Seoul' population='940'/>
        <Welcome city='Daegu' population='230'></Welcome>
    </>
    );}

export default Example1;