export default function Box1(props){
    console.log(props.children);
    return(
        <>
            {/* <div style='background-color:green'>hi</div> */}
            <div
                className='box'
                style={
                    {backgroundColor:props.color}
                }
            >
                {props.name}
                {props.children}
            </div>
        </>
    );
}