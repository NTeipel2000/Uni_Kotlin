fun main(){
    val tree = NumberNode(5,
        left = NumberNode(3,
            left = NumberNode(2,
                left = NumberNode(1)),
            right = NumberNode(4)),
        right = NumberNode(8,
            right = NumberNode(10))
    )

    tree.ausgabe()
    println("\nSize: ${tree.size()}")
    println("Sum: ${tree.sum()}")
    println("Avg: ${tree.average()}\n")

    tree.add(0) //Geht nicht
    tree.ausgabe()
    println("\nSize: ${tree.size()}")
    println("Sum: ${tree.sum()}")
    println("Avg: ${tree.average()}")

}