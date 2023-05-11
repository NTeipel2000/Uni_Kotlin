package pets

import Animal

abstract class Pet (
    species: String,
    age: Int,
    val owner: String,
    val name: String
):Animal(species, age)
