//fun getBody(type:Int=0):()->Unit{
//    if(type==0){
//        return fun(){
//            println("Hello")
//        }
//    }
//    else{
//        return fun(){
//            println("Everyone")
//        }
//    }
//}
//fun main(){
//    var f = getBody(0)
//    f()
//    f = getBody(1)
//    f()
//}

fun foo(i:Int, f:(Int)->Int):Int{
    return f(i)
}

fun bar(i:Int): Int{
    return i*-1
}

fun main(){
    val myFun = ::bar // type inference
    val myFun2:(Int) -> Int = ::bar // type select
    println(myFun(1))
    println(myFun2(2))

    println(foo(3, fun(i:Int):Int{return i*-1})) // anonymous function parameter
    println(foo(4, ::bar)) // function reference parameter
}