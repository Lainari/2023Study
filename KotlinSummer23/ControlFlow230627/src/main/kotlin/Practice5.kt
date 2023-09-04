fun abs(value: Int):Int = if(value < 0) -value else value

fun main(){
    val userInput = readln().toInt()
    println("절대값 출력 : ${abs(userInput)}")
}