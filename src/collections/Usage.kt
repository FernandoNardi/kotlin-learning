package collections

/**
 * Class of food that uses another class as parameter
 * */
data class Food(val name: String, val calories: Double, val ingredients: List<Ingredients> = listOf())

/**
 * Ingredients
 * */
data class Ingredients(val name: String, val quantity: Int)

/**
 * Check for ingredients
 * */
fun hasIngredient(list: List<Ingredients>, name: String): Boolean {
    return list.filter { it.name == name }.any()
}

fun main(args: Array<String>) {

    // Create list of data
    val data = listOf(
            Food("Lasagna", 1200.0,
                    listOf(Ingredients("Flour", 1),
                            Ingredients("Ham", 5),
                            Ingredients("Cheese", 10),
                            Ingredients("Tomato sauce", 2),
                            Ingredients("Basil", 3)
                    )
            ),
            Food("Pancake", 500.0),
            Food("Omelet", 200.0),
            Food("Steak with cheese", 700.0),
            Food("Bean soup", 300.0),
            Food("Hamburger", 2000.0,
                    listOf(Ingredients("Bread", 1),
                            Ingredients("Hamburger", 3),
                            Ingredients("Cheese", 1),
                            Ingredients("Potato sticks", 1),
                            Ingredients("Bacon", 3),
                            Ingredients("Lettuce", 1),
                            Ingredients("Tomato", 1)
                    )
            )
    )

    // I have recipes on the list
    println("I have recipes? ${if (data.any()) "yes" else "no"}.")

    // How many recipes do i have in the collection?
    println("I have ${data.count()} recipes.")

    // What is the first and last recipe?
    println("The first recipe is: ${data.first().name}.")
    println("The last recipe is: ${data.last().name}.")

    // What is the sum of calories?
    val sumCalories = data.sumByDouble { it.calories }
    println("The sum of calories is: $sumCalories")

    // Sum integer
    // listOf(1,2,3,4,5,6).sum()

    // Give me the two first recipes
    val firstTwo = data.take(2)
    for (x in firstTwo.withIndex()) {
        println("${x.index + 1} - ${x.value.name}")
    }

}