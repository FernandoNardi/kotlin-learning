package basic

import java.util.*

fun whatHappened(year: Int): String {
    if (year == 2017)
        return "=2017"
    else if (year in 2018..2020)
        return "2018> 2020<"
    return "2017< 2020>"
}

fun whatHappenedExpression(year: Int) =
    if (year == 2017) "=2017"
    else if (year in 2018..2020) "2018> 2020<"
    else "2017< 2020>"

fun whatHappenedWithWhen(year: Int): String {
    when(year) {
        2017 -> return "=2017"
        2018, 2019, 2020 -> return "2018> 2020<"
        else -> return "2017< 2020>"
    }
}

fun whatHappenedWithWhen2(year: Int): String {
    return when(year) {
        2017 -> "=2017"
        2018, 2019, 2020 -> "2018> 2020<"
        else -> "2017< 2020>"
    }
}

fun whatHappenedWithWhen3(year: Int): String {
    return when {
        year == 2017 -> "=2017"
        year in 2018..2020 -> "2018> 2020<"
        else -> "2017< 2020>"
    }
}

fun whatHappenedWithWhenExpression(year: Int) = when(year) {
    2017 -> "=2017"
    2018, 2019, 2020 -> "2018> 2020<"
    else -> "2017< 2020>"
}

fun printWhatHappened(year: Int) {
    println(whatHappened(year))
    println(whatHappenedExpression(year))
    println(whatHappenedWithWhen(year))
    println(whatHappenedWithWhen2(year))
    println(whatHappenedWithWhen3(year))
    println(whatHappenedWithWhenExpression(year))
}

fun main(args: Array<String>) {

    val calendar: Calendar = Calendar.getInstance()
    val year = calendar.get(Calendar.YEAR)

    println("\n -- current year --")
    printWhatHappened(year)

    println("\n -- 2016 --")
    printWhatHappened(2016)

    println("\n -- 2018 --")
    printWhatHappened(2018)

    println("\n -- 2019 --")
    printWhatHappened(2019)

    println("\n -- 2020 --")
    printWhatHappened(2020)

    println("\n -- bigger 2020 --")
    printWhatHappened(2060)

}