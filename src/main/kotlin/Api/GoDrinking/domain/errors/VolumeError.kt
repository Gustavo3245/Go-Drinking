package Api.GoDrinking.domain.errors


// praticamente uma cópia do alcoholError
sealed class VolumeError(message: String): DomainError(message) {
    data object NegativeVolume: VolumeError("A negative value cannot be assigned to volume.")
    data object VolumeTooMuchHigh: VolumeError("Such a high value cannot be attibuted to volume")
    data class InvalidUnit(val details: String): VolumeError("Invalid Volumed formatation: $details")
}