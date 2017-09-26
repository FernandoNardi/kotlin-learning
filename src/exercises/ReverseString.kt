package exercises

fun reverseUsingSB(str: String) = StringBuilder(str).reverse().toString()

fun reverseUsingLoop(str: String): String {
    var stringReverse = StringBuilder()
    val length = str.length
    for (index in (length - 1) downTo 0) {
        stringReverse.append(str[index])
    }
    return stringReverse.toString()
}

fun reverseUsingSB2(str: String): String {
    val stringReverse = StringBuilder(str)
    return stringReverse.reverse().toString()
}

fun reverseUsingLoop2(str: String): String {
    var stringReverse = ""
    for (index in (str.length - 1) downTo 0) {
        stringReverse += str[index]
    }
    return stringReverse
}