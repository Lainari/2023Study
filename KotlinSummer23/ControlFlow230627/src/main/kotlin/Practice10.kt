fun main(){
    println("시작")
    do{
        print("숫자 입력 : ")
        val inputValue = readln().toInt()
    } while ( inputValue >= 0 )
    println("종료")
}