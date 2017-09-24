package basic

fun testSingleLine() = println("test")

fun toUpper2(str: String) =  str.toUpperCase()

fun firstLetter2(str: String, index: Int = 0) = str[index]

fun whichNumberIsBigger(n1: Int, n2: Int): Int = if (n1 > n2) n1 else n2

fun main(args: Array<String>) {
    println(testSingleLine())
    println(toUpper2("TestTEST"))
    println(firstLetter2("2TEST", 2))
    println(firstLetter2("2TEST"))
    println(whichNumberIsBigger(23, 32))
    println(whichNumberIsBigger(55, 12))
}