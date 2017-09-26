package basic

fun main(args: Array<String>) {

    val longNumber: Long = 100

    var n1: Int
    n1 = longNumber.toInt()
    println(n1)

    val strNumber = "1021"
    n1 = strNumber.toInt()
    println(n1)

    try {
        "sgfsg".toInt()
    } catch (exception: NumberFormatException) {
        println(exception)
    }
}