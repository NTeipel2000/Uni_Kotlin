package pets.pets

import pets.Pet

class Cat(
    species: String,
    age: Int,
    owner: String,
    name: String,
): Pet(species, age, owner, name){

    override fun makeSound(): String {
        return "$name sagt etwas: Miau"
    }

    fun scratchFurniture(): String{
        return "$name kratzt an Möbeln von $owner"
    }

}