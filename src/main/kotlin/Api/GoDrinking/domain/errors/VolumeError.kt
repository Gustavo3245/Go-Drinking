package Api.GoDrinking.domain.errors


// praticamente uma cópia do alcoholError
sealed class VolumeError(message: String): DomainError(message) {
    data object BelowZero: VolumeError("A negative value cannot be assigned to volume.")
    data object ExcessiveVolume: VolumeError("Such a high value cannot be attibuted to volume")
}