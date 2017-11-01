package deeper

fun operator(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun multiply(x: Int, y: Int) = x * y

fun <T> Iterable<T>.each(op: (T) -> Unit) {
    for(i in this) {
        op(i)
    }
}

fun main(args: Array<String>) {

    val list = listOf(1, 2, 3, 4)
    list.forEach{ print(it) }
    println()
    list.forEach(::print)
    println()
    list.each { print(it) }

    val strList = listOf("a", "b", "c", "d")
    println()
    strList.each { print(it) }

    val map = mapOf(Pair("name", "Maria"))
    println()
    map.values.each { print(it) }

    println("\n")
    println(operator(1, 2, ::sum))
    println(operator(1, 2, ::multiply))

}