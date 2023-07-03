fun main(){
    val fruits = LinkedList<String>()

    fruits.addFirst("Birne")
    fruits.addFirst("Apfel")
    println("Liste: $fruits")

    fruits.addLast("Erdbeere")
    println("Liste: $fruits")

    fruits.addSorted("Banane")
    println("Liste: $fruits")
    fruits.addSorted("Blaubeere")
    println("Liste: $fruits")

    val newList = LinkedList<String>()
    newList.addLast("Wassermelone")
    newList.addLast("Mango")

    fruits.appendList(newList)
    println("Liste: $fruits\n")


    val found = fruits.firstWhere { element -> element.startsWith("B") }
    println("Start B: $found")

    val found2 = fruits.firstWhere { element -> element.contains("beere") }
    println("Contains beere: $found2")

    val found3 = fruits.firstWhere { element -> element.length > 10 }
    println("Length > 10: $found3")

    println("\nSize O(1): ${fruits.size}")

}