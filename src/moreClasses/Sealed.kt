package moreClasses

sealed class Result {
    class Success(val message: String): Result()
    class Error(val message: String, val errorCode: Int): Result()
}

class Repo {
    fun execute(i: Int) : Result {
        if (i == 1) {
            return Result.Success("ok")
        }
        return Result.Error("error", 404)
    }
}

class Test: Result()

fun main(args: Array<String>) {

    val r1 = Repo()
    var result: Result = r1.execute(1)

    when(result) {
        is Result.Success -> { println("ok") }
        is Result.Error -> { println("error!") }
    }

    result = r1.execute(2)

    when(result) {
        is Result.Success -> { println("ok") }
        is Result.Error -> { println("error!") }
    }
}