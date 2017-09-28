package moreFunctions

class Person() {
    fun speak() {
        println("I am speaking!")
    }
}

fun main(args: Array<String>) {

    val person: Person = Person()

    person.speak()

    fun Person.walk() {
        println("I am walking!")
    }

    person.walk()

    fun String.firstLetter(): Char {
        return this[0]
    }

    println("first".firstLetter())

}