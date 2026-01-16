package Api.GoDrinking.domain.errors

sealed class AddresError(message: String) : DomainError(message){
    data object EmptyStreet: AddresError("The street should not be an empty value.")
    data object InvalidNumber: AddresError("The value provided must be a positive value.")

}