package basic

fun printPairNumber() {
    print("\nprintPairNumber: ")
    val interval = 0..20
    for (x in interval step 2) {
        print("$x, ")
    }
}

fun printOddNumber() {
    print("\nprintOddNumber: ")
    val interval = 1..20
    for (x in interval step 2) {
        print("$x, ")
    }
}

fun printNumbersHighestToLowest() {
    print("\nprintNumbersHighestToLowest: ")
    for (x in 100 downTo 1) {
        print("$x, ")
    }
}

fun main(args: Array<String>) {

    print("for: ")
    for (x in 1..10) {
        print("$x, ")
    }

    var index = 1

    print("\nwhile: ")
    while (index < 10) {
        print("$index, ")
        index++
    }

    index = 1

    print("\ndo.while: ")
    do {
        print("$index, ")
        index++
    } while (index < 10)

    printPairNumber()
    printOddNumber()
    printNumbersHighestToLowest()
}