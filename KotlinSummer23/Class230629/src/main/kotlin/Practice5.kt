open class PositionInheritance(val x:Int, val y:Int){
    constructor(value:Int):this(value, value)
}

class TPosition(x:Int, y:Int, val z:Int):PositionInheritance(x, y)

fun main(){
    val p = PositionInheritance(0, 0)
    val tp = TPosition(1, 2, 3)
}