package deeper

data class Fraction(private val numerator: Int, private val denominator: Int) {
    operator fun plus(add: Fraction): Fraction {
        return if (denominator == add.denominator) {
            Fraction(numerator + add.numerator, denominator)
        } else {
            val common = denominator + add.denominator
            Fraction(((common / denominator) * numerator) + ((common / add.denominator) * add.numerator), common)
        }
    }

    operator fun inc() : Fraction {
        return this
    }
}

fun main(args: Array<String>) {


    var f1 = Fraction(3, 2)
    val f2 = Fraction(5, 3)
    println(f1 + f2)
    println(f1++)


    var n1 = 10

    // n1 = n1 + 10
    var test = n1.plus(10)
    println(test)

    // n1 = n1 * 10
    test = n1.times(10)
    println(test)
}