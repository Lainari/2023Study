fun main(args: Array<String>) {
    val str = readLine()!!
    val strCopy = str.uppercase()
    for(i in 0..str.length-1){
        if(str[i] === strCopy[i]){
            print(str[i].lowercase())
        }else{
            print(strCopy[i])
        }
    }
}