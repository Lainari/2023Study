fun inv(inputValue : Int): Int{
    return -inputValue
}

fun main(){
    val value:Int = readln().toInt()
    println("${inv(value)}")
}