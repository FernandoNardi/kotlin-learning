package deeper

fun main(args: Array<String>) {

    println(operator(1, 2, ::sum))
    println(operator(1, 2, ::multiply))


    val a1 = { x: Int, y: Int -> x + y }
    val a2: (Int, Int) -> Int = { u, i -> u + i }
    println(operator(10, 10, a1))
    println(operator(10, 20, a2))
    println(operator(10, 30, { x, y -> x + y }))
    println(operator(10, 40, { a: Int, b: Int -> a + b}))
}