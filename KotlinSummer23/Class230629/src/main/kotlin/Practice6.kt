open class PositionOverride(val x:Int, val y:Int){
    constructor(value:Int):this(value, value)
    open val dimension = 2
    open fun printValue(){
        println("${dimension} D ($x, $y)")
    }
}

class TPositionOverride(x:Int, y:Int, val z:Int):PositionOverride(x, y){
    override val dimension = 3
    override fun printValue(){
        println("${dimension} D ($x, $y, $z)")
    }
}

fun main(){
    PositionOverride(1, 2).printValue()
    TPositionOverride(1, 2, 3).printValue()
}