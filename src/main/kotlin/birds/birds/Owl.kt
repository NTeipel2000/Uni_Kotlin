package birds.birds

import birds.Bird

class Owl(
    species: String,
    age: Int,
    nocturnal: Boolean = true,
    val prey: List<String>
): Bird(species, age, nocturnal) {

    override fun makeSound(): String {
        TODO("Not yet implemented")
    }

    fun flySilently(): String{
        return "$species fliegt leise."
    }

    fun hunts(): String{
        return "${flySilently()} Beute: ${prey.joinToString(", ")}"
    }

}