package birds.birds

import birds.Bird

class Parrot (
    species: String,
    age: Int,
    nocturnal: Boolean = false,
    val knownWords: List<String>
): Bird(species, age, nocturnal){

    override fun makeSound(): String {
        return "$species ahmt Wörter nach: ${knownWords.joinToString(", ")}"
    }

}