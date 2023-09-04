fun main(){
    for (i in 1..3){
        println(i)
    }

    for (i in 6 downTo 0 step 2){
        println(i)
    }

    for (i in 1 until 10) { // until의 경우 10은 포함 안됨
        print(i)
    }

    for ( i in (1..4).reversed()) print(i)
}