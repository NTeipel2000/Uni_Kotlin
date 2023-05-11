package birds

import Animal

open class Bird(
    species: String,
    age: Int,
    val nocturnal: Boolean
): Animal(species, age) {
    override fun makeSound(): String {
        return "$species singt oder zwitschert!"
    }
}