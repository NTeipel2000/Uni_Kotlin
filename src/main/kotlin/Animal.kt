import adoption.Adoption

abstract class Animal(
    val species: String,
    val age: Int,
){

   val adoptions : MutableList<Adoption> = mutableListOf()
   abstract fun makeSound():String
   fun addAdoption(adoption: Adoption) = this.adoptions.add(adoption)

    override fun toString(): String {
        return "$species $age"
    }
}