fun main(){
    val addressList : List<Address> = createAddressList()
    val personList : List<Person> = createPersonList(addressList)

    println("Personen in Stadt1: ${getPersonsInSameCity(personList, "Stadt1")}\n")
    println("Nummer Personen in Land1: ${numberOfPersonsInCountry(personList, "Land1")}\n")
    println("Erste Person in Straße3: ${getFirstPersonInStreet(personList, "Straße3")}")
}

fun getPersonsInSameCity(persons: List<Person>, city: String): List<Person> = persons.filter { it.address.city == city }

fun numberOfPersonsInCountry(persons: List<Person>, country: String): Int = persons.filter { it.address.country == country }.sumOf { it.address.numberOfResidents }

fun getFirstPersonInStreet(persons: List<Person>, street: String): Person? = persons.find { it.address.street == street }

fun createAddressList(): List<Address>{
    val address1 = Address("Straße1", "1", "11111", "Stadt1", "Land1", 34)
    val address2 = Address("Straße1", "2", "11111", "Stadt1", "Land1", 21)
    val address3 = Address("Straße2", "2", "22222", "Stadt2", "Land2", 10)
    return listOf(address1, address2, address3)
}

fun createPersonList(addressList: List<Address>): List<Person>{
    val person1 = Person("Person1", 18, addressList[0])
    val person2 = Person("Person2", 26, addressList[1])
    val person3 = Person("Person3", 20, addressList[2])
    return listOf(person1, person2, person3)
}