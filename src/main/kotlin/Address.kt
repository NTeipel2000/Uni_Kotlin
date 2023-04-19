class Address(
    val street : String,
    val number : String,
    val zipCode : String,
    val city : String,
    val numberOfResidents : Int
) {
    override fun toString(): String {
        return "$street $number, $zipCode $city ($numberOfResidents Personen)"
    }
}