infix fun Int.diff(other:Int):Int{
    if(this > other) return this-other
    else return other-this
}
fun main(){
    var diff = 3 diff 1 // equal to 3.diff(1)
    println(diff)
    diff = 1 diff 3
    println(diff)
 }