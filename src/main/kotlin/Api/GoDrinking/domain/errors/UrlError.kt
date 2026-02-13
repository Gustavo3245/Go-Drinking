package Api.GoDrinking.domain.errors

sealed class UrlError(message: String): DomainError(message){
    data object Empty: UrlError("The Url text should not be null or Empty")
    data object TooLong: UrlError("The Url text should not be that long")
    data object InsecureProtocol: UrlError("The Url should start with a secure protocol: https//")
    data object InvalidFormat: UrlError("The Url should most follow a correct format")
    data object Malformed: UrlError("Type Url Error in Java 21 Url Class")
}