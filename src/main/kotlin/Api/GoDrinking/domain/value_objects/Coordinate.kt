package Api.GoDrinking.domain.value_objects

import Api.GoDrinking.domain.errors.CoordinateError
import arrow.core.Either
import arrow.core.left
import arrow.core.right

data class Coordinate
    (val latitude: Double, val longitude: Double) {
    companion object {
        fun create(latitude: Double, longitude: Double): Either<CoordinateError, Coordinate> {
            return when {
                latitude < -90.0 || latitude > 90.0 -> CoordinateError.LatitudeOutOfRange.left()
                longitude < -90.0 || longitude > 90.0 -> CoordinateError.LatitudeOutOfRange.left()
                else -> Coordinate(latitude, longitude).right()
            }
        }
    }
}
