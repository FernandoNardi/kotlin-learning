package basic

import java.util.*

fun main(args: Array<String>) {


    val calendar: Calendar = Calendar.getInstance()

    println("year: ${calendar.get(Calendar.YEAR)}")
    println("day: ${calendar.get(Calendar.DATE)}")
    println("month: ${calendar.get(Calendar.MONTH) + 1}")


    println("week of year: ${calendar.get(Calendar.WEEK_OF_YEAR)}")
    println("week of month: ${calendar.get(Calendar.WEEK_OF_MONTH)}")

    println("day of year: ${calendar.get(Calendar.DAY_OF_YEAR)}")
    println("day of month: ${calendar.get(Calendar.DAY_OF_MONTH)}")
    println("day of week in month: ${calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH)}")
    println("day of week: ${calendar.get(Calendar.DAY_OF_WEEK)}")

    println("hour of day: ${calendar.get(Calendar.HOUR_OF_DAY)}")
}