// function test(){
//     let result ='';
//     if(a){
//         if(!b){
//             result = 'c';
//         }
//     }else{
//         result = 'a';
//     }
//     result += 'b';
//     return result;
// }
// if 문 중첩 줄이기


function test(){
    // R1 : 적용
    // result += 'b';
    // return result;

    let result ='';
    if(!a){
        // R2 시작
        result = 'a';
        result += 'b';
        return result;
    } // R3 ~ R4 해결
    if(!b){
        result = 'c';
    }
    result += 'b';
    return result;
}