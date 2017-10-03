package objectorientation

class Car(private var model: String, private var power: Float = 1.0f, private var maxSpeed: Int) {

    private var currentSpeed = 0

    init {
        println("Wear your seat belt.")
    }

    override fun toString(): String {
        return "Car(model='$model', power=$power, maxSpeed=$maxSpeed, currentSpeed=$currentSpeed)"
    }

    fun speedUp() {
        println("speeding up... current speed: ${++currentSpeed}")
    }

    fun breake() {
        println("braking... current speed: ${--currentSpeed}")
    }
}

fun main(args: Array<String>) {
    val camaro = Car("Camaro", 4.2f, 290)
    val ferrari = Car("Ferrari", 6.2f, 300)
    val onix = Car("Onix", maxSpeed = 150)

    camaro.speedUp()
    camaro.speedUp()
    camaro.speedUp()
    camaro.breake()

    println(camaro)
    println(ferrari)
    println(onix)
}