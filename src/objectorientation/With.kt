package objectorientation

fun main(args: Array<String>) {

    val str = "Fernando Nardi"

    str.equals("João")
    str.capitalize()
    str.toUpperCase()
    str.decapitalize()
    str.toLowerCase()

    with(str) {
        equals("João")
        capitalize()
        toUpperCase()
        decapitalize()
        toLowerCase()
    }
}