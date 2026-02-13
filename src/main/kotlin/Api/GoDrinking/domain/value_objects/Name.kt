package Api.GoDrinking.domain.value_objects

import Api.GoDrinking.domain.errors.NameError
import arrow.core.Either
import arrow.core.left
import arrow.core.right

@JvmInline
value class Name private constructor(val message: String){
    companion object {

        private val validCharacters = Regex("^[a-zA-Z0-9À-ÿ\\s]+$")

        fun create(message: String) : Either<NameError, Name> {
            val cleanedName = message.trim()

            return when {
                message.isEmpty() -> NameError.Empty.left()
                message.length > 100 -> NameError.TooLong.left()
                !validCharacters.matches(message) -> NameError
                                                            .InvalidCharacters("Special caracters such: + = @ # &").left()
                else -> Name(cleanedName).right()
            }
        }
    }
}
