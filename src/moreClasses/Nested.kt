package moreClasses

class Computer(val processorModel: String) {
    inner class Memory(val level: Int) {
        fun getMemoryLevel(): Int {
            println(processorModel)
            return 70
        }
    }
}

fun main(args: Array<String>) {

    val m1: Computer.Memory = Computer("Intel").Memory(12)
    println(m1.getMemoryLevel())
    println(m1.level)

}