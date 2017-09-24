package basic

fun test(): Unit { // Tipo função void
    println("test")
}
// ou
fun test2() { // Tipo função void
    println("test2")
}

//--

fun toUpper(str: String) : String {
    return str.toUpperCase();
}

fun firstLetter(str: String, index: Int = 0) : Char {
    return str[index]
}

fun main(args: Array<String>) {
    test()
    test2()
    println(toUpper("FerNanDO NarDI GomES"))
    println(firstLetter("Test"))
    println(firstLetter("Test", 2))
}