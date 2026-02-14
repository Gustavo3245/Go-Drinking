package Api.GoDrinking.domain.entities

import Api.GoDrinking.domain.enums.InvitationStatus
import java.time.LocalDateTime
import java.util.UUID

data class GroupInvitation (
    val id: UUID = UUID.randomUUID(),
    val groupId: UUID,
    val inviterId: UUID,
    val inviteeId: UUID,
    val status: InvitationStatus = InvitationStatus.PENDING,

    val createdAt: LocalDateTime = LocalDateTime.now(),
    val expiresAt: LocalDateTime = LocalDateTime.now().plusDays(7)
)