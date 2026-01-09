package Api.GoDrinking.domain.errors

// praticamente uma cópia do alcoholError
sealed class VolumeError {
    data object NegativeVolume: VolumeError()
    data object VolumeTooMuchHigh: VolumeError()
    data class InvalidUnit(val message: String): VolumeError()
}