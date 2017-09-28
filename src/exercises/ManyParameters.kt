package exercises

fun sumAllParameters(vararg numbers: Int) = numbers.sum()

fun <T> sumAllGenericsParameters(vararg numbers: T): Double {
    var sum = 0.0
    for (number in numbers) {
        if(number is Int) {
            sum += number
        } else if(number is Double) {
            sum += number
        }
    }
    return sum
}