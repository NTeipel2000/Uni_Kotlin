class Address(
    val plz : String,
    val stadt : String,
    val strasse : String,
    val hausnummer : String) {

    fun write(){
        println("Adresse: ${plz} ${stadt} ${strasse} ${hausnummer}")
    }
}