fun main() {
    val intCount = readln().toInt()
    val nums = readln().split(" ")
    val wantFindNum = readln().toInt()
    println(nums.count { it.toInt() == wantFindNum })
}