package Api.GoDrinking.domain.value_objects

import Api.GoDrinking.domain.errors.NameError
import arrow.core.Either
import arrow.core.left
import arrow.core.right

@JvmInline
value class Name private constructor(val message: String){
    companion object {
        fun create(message: String) : Either<NameError, Name> {
            val cleanedName = message.trim()

            return when {
                message.isEmpty() -> NameError.Empty.left()
                message.length > 50 -> NameError.TooLong.left()
                else -> Name(cleanedName).right()
            }
        }
    }
}
