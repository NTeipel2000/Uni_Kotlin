fun main(){
    val adr = Address(
        "Steinmüllerallee",
        "1",
        "51643",
        "Gummersbach",
        400)

    val p1 = Person("Nils", 22, adr)
    val p2 = Person("Max", 28, null)
    val p3 = Person("Tim", 26, null)
    p3.friends = mutableListOf(p1, p2)

    println(p1)
    println(p2)
    println(p3)
    p2.printFriends()
    p3.filterFriends(25)

}