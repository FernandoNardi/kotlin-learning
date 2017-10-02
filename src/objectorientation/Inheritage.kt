package objectorientation

open class Animal(val name: String) {
    fun sayMayName() {
        println("My name is $name")
    }
}

class Mammal(name: String): Animal(name)

fun main(args: Array<String>) {

    val a1 = Mammal("Titi")
    val a2 = Mammal("João")

    a1.sayMayName()
    a2.sayMayName()
}