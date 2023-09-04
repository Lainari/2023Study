open class PositionPrintValue(val x:Int, val y:Int){
    constructor(value:Int):this(value,value)
    open fun printValue(){
        println("($x, $y)")
    }
}

class TPositionPrintValue(x:Int, y:Int, val z:Int):PositionPrintValue(x, y){
    override fun printValue() {
        println("($x, $y, $z)")
    }
}

fun main(){
    PositionPrintValue(1, 2).printValue()
    TPositionPrintValue(1, 2, 3).printValue()
}