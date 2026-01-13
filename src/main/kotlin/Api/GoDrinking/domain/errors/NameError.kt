package Api.GoDrinking.domain.errors

sealed class NameError(message: String): DomainError(message) {
    data object Empty: NameError("name should't not be empty")
    data object TooLong: NameError("name should't not be that long (50 characters)")
}