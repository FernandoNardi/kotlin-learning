package moreFunctions

fun writeAddress(street: String, city: String = "city default", state: String, cep: String = "cep default") {
    print("Street: $street ")
    println("City: $city, $state - $cep")
}

fun main(args: Array<String>) {
    writeAddress(street = "1 - Raja", state = "Minas Gerais")
    writeAddress("2 - Raja", "Belo Horizonte", "Minas Gerais", "3256-897")
    writeAddress("3 - Raja", "Belo Horizonte", "Minas Gerais")
    writeAddress("4 - Raja", state = "Minas Gerais", cep = "3256-897")
}