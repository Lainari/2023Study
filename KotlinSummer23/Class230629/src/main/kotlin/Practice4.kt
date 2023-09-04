class PositionSecondaryConstructor(val x:Int, val y:Int){
    constructor(value:Int):this(value, value)
}
fun main(){
    val p1 = PositionSecondaryConstructor(0, 0)
    val p2 = PositionSecondaryConstructor(1, 1)
    val p3 = PositionSecondaryConstructor(2)
}