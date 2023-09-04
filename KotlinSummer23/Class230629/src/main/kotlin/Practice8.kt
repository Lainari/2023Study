class PropertyTest(){
    var count = 0
        set(value:Int){
            if(value >= 0) field = value
        }
}
fun main(){
    val pt = PropertyTest()
    pt.count = -1
    println(pt.count)
    pt.count = 1
    println(pt.count)
}