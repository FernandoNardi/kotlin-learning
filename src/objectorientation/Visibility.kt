package objectorientation

open class Car1(val model: String) {

    private var velocity: Int = 0
    protected var velocityTest: Int = 0

    fun slowDown() {
        // rules
        velocity--
    }

    fun accelater() {

    }
}

class Ferrari: Car1("Ferrari") {
    fun accelarete() {
        velocityTest += 100
    }
}

fun main(args: Array<String>) {

    val camaro = Car1("Camaro")
    camaro.slowDown()


}