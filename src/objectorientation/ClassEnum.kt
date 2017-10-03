package objectorientation

enum class Priority(val id: Int) {
    LOW(1) {
        override fun toString(): String {
            return "This is the only one!"
        }
    }, MEDIUM(5), HIGH(10), CRITICAL(20);

    override fun toString(): String {
        return "$name is in position $ordinal"
    }

    fun test() {
        println("Test")
    }
}

fun main(args: Array<String>) {

    println(Priority.LOW.id)
    println(Priority.CRITICAL.id)

    for(p in Priority.values()) {
        if (p == Priority.CRITICAL) {
            println("This is very important")
        } else {
            println("priority: $p")
            p.test()
        }
    }

}