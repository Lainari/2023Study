import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val array = IntArray(9)

    for (i in 0..8) {
        array[i] = sc.nextInt()
    }

    maxResult(array)
}

fun maxResult(array: IntArray) {
    var max = array[0]
    var index = 1
    for (i in array.indices) {

        if (max < array[i])  {
            max = array[i]
            index = getIndex(i + 1)
        }
    }

    println(max)
    println(index)
}

fun getIndex(index: Int) = index