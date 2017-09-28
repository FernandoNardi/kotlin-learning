package nullSafe

fun main(t: Array<String>) {

    println("example one")
    val str: String? = null
    println(str?.length) // return null

    val l = str?.length ?: -1
    println("l: $l")

    println("\nexample two")
    try {
        println(str!!.length) // assumindo o risco - lançando a exceção
    } catch (exception: NullPointerException) {
        println("Exception: ${exception.message}")
    }

    println("\nexample tree")
    val n1 = NullExampleJava()
    println(n1.age)
    println(n1.name)

    println("\nexample four")
    val n2 = NullExampleJava.getInstance()
    println(n2?.age)
    try {
        println(n2.age) // triggered exception
    } catch (exception: NullPointerException) {
        println("Exception: ${exception.message}")
    }

    println(n2?.name?.length)

    // ? -> operador Elvis("the Elvis operator is the ternary operator with its second operand omitted.")
    // !! -> assumed risk
}