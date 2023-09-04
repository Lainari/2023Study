fun main() {
    var repeat = readln().toInt()
    for(i in 1..repeat){
        for(j in 0 until repeat-i) print(" ");
        for(j in 0 until (i-1)*2+1) print("*")
        println()
    }
    for(i in repeat-1 downTo 1){
        for(j in 0 until repeat-i) print(" ");
        for(j in 0 until (i-1)*2+1) print("*")
        println()
    }
}