package com.example.Funtest

fun add(input1:Int, input2:Int):Int{
    return input1 + input2
}

fun sub(input1:Int, input2:Int):Int{
    return input1 - input2
}

fun mul(input1:Int, input2:Int):Int{
    return input1 * input2
}

fun div(input1:Int, input2:Int):Int{
    return input1 / input2
}

fun helloName(inputName:String):String{
    return "Hello ${inputName}"
}

fun main(){
    println("add 함수 1, 1 : ${add(1, 1)}")
    println("sub 함수 2, 1 : ${sub(2, 1)}")
    println("mul 함수 2, 2 : ${mul(2, 2)}")
    println("div 함수 4, 2 : ${div(4, 2)}")
    println("helloName 함수 jinseok : ${helloName("jinseok")}")
}