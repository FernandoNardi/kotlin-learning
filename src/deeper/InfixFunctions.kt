package deeper

class Person(val name: String) {
    infix fun isName(value: String): Boolean {
        return value == name
    }
}

infix fun Int.isHafOf(value: Int) = value / 2 == this

fun main(args: Array<String>) {

    println(10.isHafOf(20))

    println(10 isHafOf 20)
    println(10 isHafOf 30)

    println(10 isHafOf(20))



    val p1 = Person("kotlin")
    println(p1 isName "kotlin")
    println(p1 isName "apple")

}