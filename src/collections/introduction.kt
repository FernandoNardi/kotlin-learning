package collections

fun main(args: Array<String>) {

    // List - array, sett Hashmap

    val l1 = listOf("Madrid", "São Paulo", "Chicago") // immutable
    val l2 = mutableListOf("Madrid", "São Paulo", "Chicago") // mutable

    val a1 = arrayListOf("Madrid", "São Paulo", "Chicago") // return array list java

    val s1 = setOf("Madrid", "São Paulo", "Chicago", "Chicago") // does not repeat element in array | immutable
    val s2 = mutableSetOf("Madrid", "São Paulo", "Chicago", "Chicago") // does not repeat element in array | mutable
    println("s1.size: ${s1.size} e s2.size: ${s2.size}")

    val h1 = hashMapOf(Pair("key", "value"), Pair("Spanish", "Madrid"))
    println(h1.entries)
    println(h1["Spanish"])

    val m1 = mapOf(Pair("key", "value"), Pair("Spanish", "Madrid")) // immutable
    val m2 = mutableMapOf(Pair("key", "value"), Pair("Spanish", "Madrid")) // mutable



}