import adoption.adoptions.LimitedAdoption
import adoption.adoptions.UnlimitedAdoption
import birds.Bird
import birds.birds.Owl
import birds.birds.Parrot
import pets.pets.Cat
import pets.pets.Dog

fun main(){
    val bird = Bird("Amsel", 1, false)
    val owl = Owl("Eule", 5, true , listOf("Maus", "Maulwurf"))

    val dog = Dog("Golden Retriever", 6, "Anja", "Emma", true)
    dog.addAdoption(UnlimitedAdoption("Sandy"))

    val cat = Cat("Britisch Kurzhaar", 1, "Sascha", "Lucy")
    cat.addAdoption(LimitedAdoption(60))
    cat.addAdoption(UnlimitedAdoption("Sandy"))

    val parrot = Parrot ("Blaupapagei", 1, false , listOf (" Hallo", "Guten Tag", "Ich mag Pizza", "Tschüß"))
    parrot.addAdoption(UnlimitedAdoption("Mario"))

    val zoo = Zoo()
    zoo.addAnimal(dog)
    zoo.addAnimal(cat)
    zoo.addAnimal(bird)
    zoo.addAnimal(owl)
    zoo.addAnimal(parrot)

    println("totalAdoptedMoney: ${zoo.getTotalAdoptionMoney()}€")
    println("getBirdsInZoo: ${zoo.getBirdsInZoo()}")
    println("getUnlimitedAdopters: ${zoo.getUnlimitedAdopters()}")
    println("getGreetingParrots: ${zoo.getNumberOfGreetingParrots(listOf("Hallo", "Guten Tag"))}")
    println("getBabies: ${zoo.getBabies()}")
}