package Api.GoDrinking.domain.value_objects

import Api.GoDrinking.domain.errors.PreparationMethodError
import arrow.core.Either
import arrow.core.left
import arrow.core.right

@JvmInline
value class PreparationMethod private constructor(val message: String){
    companion object {
        fun create(content: String): Either<PreparationMethodError, PreparationMethod>{
            return when {
                content.isEmpty() -> PreparationMethodError.WithoutMethod.left()
                else -> PreparationMethod(content).right()
            }
        }
    }
}
