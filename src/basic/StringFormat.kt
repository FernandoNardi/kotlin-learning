package basic

fun main (args: Array<String>) {

    var name = """
        Fernando
        Nardi
        Gomes
        """

    println(name)

    name = """
    Fernando
            Nardi
Gomes
        """

    println(name)

    name = """
        |Fernando
        |Nardi
        |Gomes
        """.trimMargin()

    println(name)

    name = "Fernando Nardi Gomes"
    println("Nome: $name. Tamanho: ${name.length}")
    println("Primeira letra: ${name[0]}")

}