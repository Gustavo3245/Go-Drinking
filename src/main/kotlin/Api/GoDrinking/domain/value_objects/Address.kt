package Api.GoDrinking.domain.value_objects

import Api.GoDrinking.domain.errors.AddresError
import arrow.core.Either
import arrow.core.left
import arrow.core.right


data class Address(
    val street: String,
    val number: Int,
    val city: String,
    val state: String
    ) {
    companion object {
        fun create(street: String, number: Int, city: String, state: String) : Either<AddresError, Address> {
            return when {
                street.isEmpty() -> AddresError.EmptyStreet.left()
                number <= 0 -> AddresError.InvalidNumber.left()
                else -> Address(street.trim(), number,
                                city.trim(), state.uppercase()).right()
            }
        }
    }
}