class Person(
    val name : String,
    var age : Int,
    val address: Address
) {
    override fun toString(): String {
        return "\nname='$name', age=$age, address=$address"
    }
}