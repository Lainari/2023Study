function CoupangImageBox({imgUrl}){
    return(
        <img
            className="coupangImg"
            src={imgUrl}
            alt="SomethingHere"
            width={100}
            height={100}
        />
    )
}

export default function CoupangImage({imgUrl}){
    return(
        <CoupangImageBox/>
    );
}