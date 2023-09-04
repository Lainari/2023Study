fun main(){
    val num = readln().toInt()
    val array = readln().split(" ").map{it.toInt()}
    println("${array.minOrNull()} ${array.maxOrNull()}")
}