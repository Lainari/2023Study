fun main(){
    var inputValue = readln().toInt()
    val abs = if (inputValue < 0) {
        -inputValue
    }else{
        inputValue
    }
    println("절대값 출력 : ${abs}")
}