package Api.GoDrinking.domain.enums

enum class Invitation_status(val description: String) {
    PENDING("Waiting Confirmation"), ACCEPTED("Accepted invitation"), DECLINED("Declined invitation")
}