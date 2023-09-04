fun main(){
    // 랜덤 숫자 뽑는법
    val randomValue = (1..20).random()
    if (randomValue >= 10) println("${randomValue} : 숫자-big")
    else println("${randomValue} : 숫자-small")
}