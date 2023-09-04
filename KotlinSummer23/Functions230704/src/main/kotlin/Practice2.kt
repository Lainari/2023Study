fun foo(vararg items:Int){
    for(i in items)
        print(i)
    println()
}

fun main(){
    foo()
    foo(1, 2, 3)
    foo(1, 2, 3, 4, 5)
}