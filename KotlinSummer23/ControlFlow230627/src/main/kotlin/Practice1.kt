fun main(){
    val inputValue = readln().toInt()
    if (inputValue > 0){
        println("Positive")
    } else if (inputValue < 0){
        println("Negative")
    } else {
        println("Zero")
    }
}