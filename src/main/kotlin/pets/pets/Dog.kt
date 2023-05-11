package pets.pets

import pets.Pet

class Dog (
    species: String,
    age: Int,
    owner: String,
    name: String,
    val wagsTail: Boolean
): Pet(species, age, owner, name){

    override fun makeSound(): String {
        return "$name sagt etwas: Wuff"
    }
    fun fetchToy(): String{
        return "$name bringt Spielzeug zurück: Er freut sich ${if (!wagsTail)"nicht" else ""}"
    }

}