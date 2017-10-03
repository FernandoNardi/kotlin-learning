package objectorientation

abstract class Test {
    abstract fun sayValue()
}

class Math {
    object Constants: Test() {

        val PI: Double = 2.1415

        override fun sayValue() {
            println("My value is $PI")
        }
    }

    companion object {
        val PI: Double = 2.1415

        fun sayValue() {
            println("My value is $PI")
        }
    }
}

class DataBaseConstants private constructor() {
    companion object GUEST {
        val TABLE_NAME = "Guest"

        object COLUMNS {
            val id = "id"
            val name = "name"
            val presence = "presence"
            val document = "document"
        }
    }
}

fun main(args: Array<String>) {

    Math.Constants.PI
    Math.Companion.PI
    Math.PI

    Math.Companion.sayValue()
    Math.sayValue()

    Math.Constants.sayValue()


    DataBaseConstants.TABLE_NAME
    DataBaseConstants.GUEST.COLUMNS.id
}
