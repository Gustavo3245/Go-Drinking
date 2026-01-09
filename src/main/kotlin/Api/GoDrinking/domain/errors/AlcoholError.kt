package Api.GoDrinking.domain.errors

// adicionando dois dos errors mais comuns entre números doubles.
sealed class AlcoholError {
    data object TooMuchAlcohol: AlcoholError()
    data object NegativeAlcohol: AlcoholError()
    data class InvalidFormat(val messase: String): AlcoholError()
}