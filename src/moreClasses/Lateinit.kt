package moreClasses

class Repository() {
    fun execute() {}
}

class Business() {

    lateinit var repository: Repository
//    lateinit var value: Int // error
    lateinit var str: String

    fun execute() {
        repository = Repository()
    }
}

fun main(args: Array<String>) {

}