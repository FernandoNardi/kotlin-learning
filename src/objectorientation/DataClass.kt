package objectorientation

data class Person(var name: String, var age: Int)

fun main(args: Array<String>) {

    val p1 = Person("Kotlin", 25)
    val p2 = Person("Kotlin", 25)
    val p3 = p1

    println(p1.equals(p2))
    println(p3.equals(p1))

    val p4 = p1.copy()
    println(p4.equals(p1))


    println("p1: $p1")
    println("p3: $p3")
    p3.name = "Test"
    p4.age = 1000
    println("p1: $p1")
    println("p3: $p3")
    println("p4: $p4")

}