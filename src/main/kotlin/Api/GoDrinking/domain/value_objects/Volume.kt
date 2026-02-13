package Api.GoDrinking.domain.value_objects

import Api.GoDrinking.domain.enums.VolumeUnit
import Api.GoDrinking.domain.errors.VolumeError
import arrow.core.Either
import arrow.core.left
import arrow.core.right

data class Volume (val volume: Double, val unit: VolumeUnit) {
    companion object {

        fun create(value: Double, unit: VolumeUnit): Either<VolumeError, Volume> {

            return when {
                value <= 0.0 -> VolumeError.NegativeVolume.left()
                else -> Volume(value, unit).right()
            }
        }
    }

    fun convertedToMl(): Double = when (unit) {
        VolumeUnit.OZ -> volume * 29.57
        VolumeUnit.ML -> volume
        VolumeUnit.GRAMS -> volume
        VolumeUnit.L -> volume / 1000
    }
}
