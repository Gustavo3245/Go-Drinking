package Api.GoDrinking.domain.errors

sealed class VolumeError {
    data object NegativeVolume: VolumeError()
    data object VolumeTooMuchHigh: VolumeError()
    data class InvalidUnit(val message: String): VolumeError()
}