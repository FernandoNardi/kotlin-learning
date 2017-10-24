package moreClasses

class Car(val model: String, val maxSpeed: Int) {

    var currentSpeed = 0
        set (value) {
            if(value > maxSpeed) {
                throw Exception("max speed of: ${maxSpeed}")
            } else {
                field = value
            }
        }
}

fun main(args: Array<String>) {
    val c1 = Car("", 220)
    try {
        c1.currentSpeed = 10
    } catch (e: Exception) {
        println(e.message)
    }
    println(c1.currentSpeed)
}