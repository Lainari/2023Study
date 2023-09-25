import TestProps from "./components/exam1/TestProps"

const App = (props)=>{
    return(
        <>
            {/* <TestProps first='한글' second='⭐⭐⭐' third={true}/> */}
            {/* <TestProps first='이름' second='석진석' third={1234}/> */}
            {/* 숫자, 불형(true/false)를 프롭스로 전달시에는 주의 필요 : {123} {true} */}
            {/* <TestProps />
            <TestProps first='김씨'/>
            <TestProps first='김씨' second='이씨'/>
            <TestProps first='김씨' second='이씨' third='박씨'/> */}

            <TestProps first='mr.seok' second='석진석' third='대구' fourth='남' />
            <TestProps first='mr.seok' second='석진석' third='대구'/>
            <TestProps first='mr.seok' second='석진석' third='대구' fourth='여'/>
            <TestProps first='mr.seok' second='석진석' third='대구' fourth='놈'/>
        </>
    )
}

export default App;