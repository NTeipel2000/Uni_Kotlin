package adoption.adoptions

import adoption.Adoption

class LimitedAdoption(
    override val days: Int,
    override val price: Double = days * 5.0,
    override val benefits: List<String> = listOf("Besuchen", "Füttern")
): Adoption {

}