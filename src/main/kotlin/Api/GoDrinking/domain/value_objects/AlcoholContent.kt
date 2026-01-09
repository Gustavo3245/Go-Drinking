package Api.GoDrinking.domain.value_objects

import arrow.core.Either
import Api.GoDrinking.domain.errors.AlcoholError
import arrow.core.left
import arrow.core.right

@JvmInline
value class AlcoholContent private constructor(val percentage: Double) {
    companion object {
        fun create(value: Double) : Either<AlcoholError, AlcoholContent> {
            return when {
                value < 0.0 -> AlcoholError.NegativeAlcohol.left()
                value > 100.0 -> AlcoholError.TooMuchAlcohol.left()
                else -> AlcoholContent(value).right()
            }
        }
    }

}