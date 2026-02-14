package Api.GoDrinking.domain.value_objects

import Api.GoDrinking.domain.enums.UnitOfMeasure
import Api.GoDrinking.domain.errors.VolumeError
import arrow.core.Either
import arrow.core.left
import arrow.core.right

data class Volume (val volume: Double, val unit: UnitOfMeasure) {
    companion object {
        val MAX_VOLUME_ML = 20000.0

        fun create(value: Double, unit: UnitOfMeasure): Either<VolumeError, Volume> {
            val normalizedML = value * unit.mlFactor

            return when {
                value <= 0.0 -> VolumeError.BelowZero.left()
                normalizedML > MAX_VOLUME_ML -> VolumeError.ExcessiveVolume.left()
                else -> Volume(value, unit).right()
            }
        }
    }

}
