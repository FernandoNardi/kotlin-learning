package deeper

import java.text.SimpleDateFormat
import java.util.*

fun log(str: String) {
    println("$str")
}

fun top() {

    fun log(str: String) {
        val calendar = Calendar.getInstance()
        val formatted = SimpleDateFormat("HH:mm:ss")
        println("$str = ${formatted.format(calendar.time)}")
    }

    log("Start")

    val interval = 1..1000000000
    val sum: Double = interval.sumByDouble { (it * 2 * 1).toDouble() }
    println(sum)

    log("End")

    deeper.log("Test")
}

fun main(args: Array<String>) {


    // without access log function
    // top().log()
    // top.log()
    // log()

    top()
    log("Test two")
}