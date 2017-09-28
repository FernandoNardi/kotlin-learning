package moreFunctions

fun many(vararg strs: String) {
    strs.iterator().forEach { println(it) }
}

fun main(args: Array<String>) {
    println("capitalize")
    println("kotlin".capitalize())

    println("\ndecapitalize")
    println("Kotlin".decapitalize())

    println("\nstartsWith")
    println("kotlin".startsWith("k"))
    println("Kotlin".startsWith("k"))
    println("Kotlin".startsWith("k", true))

    println("\nendsWith")
    println("kotlin".endsWith("n"))
    println("KotliN".endsWith("n"))
    println("Kotlin".endsWith("n", true))

    println("\niterator")
    many()
    many("a", "e", "i", "o", "u")
}