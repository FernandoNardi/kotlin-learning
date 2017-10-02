package objectorientation

interface Interface1 {
    fun hello() {
        println("Hello interface 1")
    }
}

interface Interface2 {
    fun hello() {
        println("Hello interface 2")
    }
}

class implementsInterface : Interface1, Interface2 {
    override fun hello() {
        super<Interface1>.hello()
    }

}

fun main(args: Array<String>) {

    val a1 = implementsInterface()
    a1.hello()
}