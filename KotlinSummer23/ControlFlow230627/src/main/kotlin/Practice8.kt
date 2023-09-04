fun getGrade(value:Int):String = when(value){
    in 90..100 -> "A"
    in 80..89 -> "B"
    in 70..79 -> "C"
    in 60..69 -> "D"
    else -> "F"
}

fun main(){
    val inputValue = readln().toInt()
    val grade = getGrade(inputValue)
    println("성적 : ${inputValue} - 학점 : ${grade}")
}