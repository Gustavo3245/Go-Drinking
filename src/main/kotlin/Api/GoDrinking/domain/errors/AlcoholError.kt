package Api.GoDrinking.domain.errors

// adicionando dois dos errors mais comuns entre números doubles.
sealed class AlcoholError(message: String): DomainError(message)  {
    data object TooMuchAlcohol: AlcoholError("Alcohol content exceeded the limit")
    data object NegativeAlcohol: AlcoholError("The Alcohol content cannot be negative")
    data class InvalidFormat( val details: String): AlcoholError("Invalid Alcohol content: $details")
}