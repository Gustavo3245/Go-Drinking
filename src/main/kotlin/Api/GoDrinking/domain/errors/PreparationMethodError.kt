package Api.GoDrinking.domain.errors

sealed class PreparationMethodError(message: String): DomainError(message) {
    data object WithoutMethod: PreparationMethodError("Drinks should have a preparation method.")
    data object MethodTooBig: PreparationMethodError("Preparation method exceeds character limit.")
}