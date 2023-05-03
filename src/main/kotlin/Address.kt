class Address(
    val street : String,
    val number : String,
    val zipCode : String,
    val city : String,
    val country : String,
    val numberOfResidents : Int
) {
    override fun toString(): String {
        return "street='$street', number='$number', zipCode='$zipCode', city='$city', country='$country', numberOfResidents=$numberOfResidents"
    }
}