package adoption.adoptions

import adoption.Adoption

class UnlimitedAdoption(
    val name: String,
    override val days: Int = Int.MAX_VALUE,
    override val price: Double = 1000.0,
    override val benefits: List<String> = listOf(
        "Besuchen",
        "Füttern",
        "Streicheln",
        "Gedenktafel für $name")
): Adoption {
}