fun foo(name:String, ex:()->Unit){
    print(name);
    ex()
}
fun bar(param1:Int=0, ex:()->Unit){
    print(param1)
    ex()
}
fun main(){
    foo("User") {println("Foo")}
    bar(1) {println("Bar")}
    bar{println("Foo")}
}