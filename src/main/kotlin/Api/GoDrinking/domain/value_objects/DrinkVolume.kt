package Api.GoDrinking.domain.value_objects

import Api.GoDrinking.domain.enums.VolumeUnit
import Api.GoDrinking.domain.errors.VolumeError
import arrow.core.Either
import arrow.core.left
import arrow.core.right

@JvmInline
value class DrinkVolume private constructor(val volume: Double) {
    companion object {
        private const val MAX_VOLUME_ML = 10000.0

        fun create(value: Double, unit: VolumeUnit): Either<VolumeError, DrinkVolume> {

            val convertedToMl = when (unit) {
                VolumeUnit.L -> value * 1000
                VolumeUnit.OZ -> value * 29.57
                VolumeUnit.ML -> value
            }

            return when {
                convertedToMl <= 0.0 -> VolumeError.NegativeVolume.left()
                convertedToMl > MAX_VOLUME_ML -> VolumeError.VolumeTooMuchHigh.left()
                else -> DrinkVolume(convertedToMl).right()
            }
        }
    }

    fun toUnit(unit: VolumeUnit): Double = when (unit) {
        VolumeUnit.ML -> volume
        VolumeUnit.OZ -> volume / 29.57
        VolumeUnit.L -> volume / 1000
    }
}