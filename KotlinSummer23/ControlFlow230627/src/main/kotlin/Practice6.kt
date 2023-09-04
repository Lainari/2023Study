fun main(){
    val value = readln().toInt()
    val grade = when(value){
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "F"
    }
    println("점수 : ${value} - 학점 : ${grade}")
}