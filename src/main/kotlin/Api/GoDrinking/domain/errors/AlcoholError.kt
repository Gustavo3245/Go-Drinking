package Api.GoDrinking.domain.errors

// adicionando dois dos errors mais comuns entre números doubles.
sealed class AlcoholError(message: String): DomainError(message)  {
    data object AboveLimit: AlcoholError("Alcohol content exceeded the limit")
    data object BelowZero: AlcoholError("The Alcohol content cannot be negative")
    data object InvalidNumber: AlcoholError("Invalid Alcohol content")
}