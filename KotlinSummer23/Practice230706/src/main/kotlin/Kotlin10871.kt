fun main(){
    val conditions = readln().split(" ")
    val array = readln().split(" ")
    println(array.filter {it.toInt() < conditions[1].toInt()}.joinToString(" "))
}