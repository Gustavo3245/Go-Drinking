package Api.GoDrinking.domain.enums

enum class InvitationStatus(val description: String) {
    PENDING("Waiting Confirmation"), ACCEPTED("Accepted invitation"),
    DECLINED("Declined invitation"), EXPIRED("Pass the right time")
}