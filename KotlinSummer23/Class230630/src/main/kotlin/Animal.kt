abstract class Animal(val name:String){
    abstract fun say():String
}

class Dog(name:String): Animal(name){
    override fun say():String = "멍멍"
}
class Cat(name:String): Animal(name){
    override fun say():String = "야옹"
}

fun main(){
    val dog = Dog("개")
    val cat = Cat("고양이")

    println(dog.say())
    println(cat.say())
}