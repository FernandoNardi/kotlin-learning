package moreFunctions

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
}