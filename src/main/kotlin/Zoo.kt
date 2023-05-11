import adoption.adoptions.UnlimitedAdoption
import birds.Bird
import birds.birds.Parrot

class Zoo {
    private val animals : MutableList<Animal> = mutableListOf()

    fun addAnimal(animal: Animal) = animals.add(animal)
    fun removeAnimal(animal: Animal) = animals.remove(animal)
    fun getTotalAdoptionMoney() = animals.sumOf{it.adoptions.sumOf{it.price}}
    fun getBirdsInZoo() = animals.filterIsInstance<Bird>()
    fun getUnlimitedAdopters(): List<String>{
        val names = mutableListOf<String>()
        for(a in animals)
            for(u in a.adoptions)
                if(u is UnlimitedAdoption)
                    names.add(u.name)
        return names.distinct()
    }

    fun getNumberOfGreetingParrots(words: List<String>): Int{
        var count = 0
        for(a in animals){
            if(a is Parrot){
                for(s in a.knownWords){
                    for(w in words)
                        if(s == w){
                            count++
                            break
                        }
                }
            }
        }
        return count
    }

    fun getBabies() = animals.filter { it.age <= 1 }

}