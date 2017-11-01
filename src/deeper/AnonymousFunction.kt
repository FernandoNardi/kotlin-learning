package deeper

fun main(args: Array<String>) {

    val result = operator(1, 2, fun (n1: Int, n2: Int): Int {
        val sum = n1 + n2
        print("n1 + n2 = ")
        return sum
    })

    println()
    println(result)
}