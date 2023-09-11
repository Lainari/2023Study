export default function Box(props){
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
            </div>
        </>
    );
}

Box.defaultProps = {
    name:'기본상자',
    color:'yellow'
};