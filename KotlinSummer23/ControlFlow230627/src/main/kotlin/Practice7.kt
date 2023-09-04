fun main(){
    val result = when((-10..10).random()){
        0 -> "Zero"
        else -> "non Zero"
    }
    println("랜덤 값은 ${result}")
}