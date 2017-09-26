package basic

fun main(args: Array<String>) {

    try {
        var number = "test".toInt()
        println(number)
    } catch (exception: NullPointerException) {
        println("Null pointer - ${exception.message}")
    } catch (exception: NumberFormatException) {
        println("Not is number - ${exception.message}")
    } catch (exception: Exception) {
        println("Generic exception - ${exception.message}")
    } finally {
        println("I am always executed")
    }
}