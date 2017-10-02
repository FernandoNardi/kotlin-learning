package objectorientation

open class Animal1(val name: String) {
    open fun sayMayName() {
        print("My name is $name. ")
    }
}

class Mammal1(name: String, var age: Int): Animal1(name) {
    override fun sayMayName() {
        super.sayMayName()
        println("I am $age years.")
    }

    fun sayMyName(age: Int) {
        println("My name is $name. I am $age years.")
    }
}

fun main(args: Array<String>) {

    val a1 = Mammal1("Titi", 10)
    val a2 = Mammal1("João", 5)

    a1.sayMayName()
    a2.sayMayName()

    a2.sayMyName(10)
}