package Api.GoDrinking.domain.errors

sealed class CoordinateError(message: String): DomainError(message) {
    data object LatitudeOutOfRange: CoordinateError("Invalid Coordinate Format input")
    data object LongitudeOutOfRange: CoordinateError("Invalid Coordinate Format input")
}
