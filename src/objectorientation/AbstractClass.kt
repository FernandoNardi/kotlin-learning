package objectorientation

abstract class Animal2(val name: String) {
    open fun sayMayName() {
        print("My name is $name. ")
    }

    abstract fun talk()
}

open class Mammal2(name: String, var age: Int): Animal2(name) {
    override fun talk() {
    }

    override fun sayMayName() {
        super.sayMayName()
        println("I am $age years.")
    }

    fun sayMyName(age: Int) {
        println("My name is $name. I am $age years.")
    }
}

class Dog(name: String, age: Int): Mammal2(name, age) {
    override fun talk() {
        println("I am Dog. ")
        super.talk()
    }
}

fun main(args: Array<String>) {

    val dog = Dog("Titi", 1)

    dog.talk()
    dog.sayMayName()
    dog.sayMyName(2)
}