package Api.GoDrinking.domain.errors

sealed class AlcoholError {
    data object TooMuchAlcohol: AlcoholError()
    data object NegativeAlcohol: AlcoholError()
    data class InvalidFormat(val messase: String): AlcoholError()
}