package objectorientation

class PrivateClient private constructor() {
    // static methods
}

// can be instantiated
class Client(val name: String) {
    constructor(n: String, age: Int): this(n)
}

fun main(args: Array<String>) {
    val c1 = Client("Kotlin")
    val c2 = Client("Kotlin", 26)
}