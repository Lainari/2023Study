fun main(){
    val randomGuGu = (2..9).random()
    for(i in 1..9){
        println("$randomGuGu x $i = ${randomGuGu*i}")
    }
}