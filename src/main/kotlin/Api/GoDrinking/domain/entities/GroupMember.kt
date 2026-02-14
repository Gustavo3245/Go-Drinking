package Api.GoDrinking.domain.entities

import Api.GoDrinking.domain.enums.GroupRole
import Api.GoDrinking.domain.enums.Invitation_status
import java.time.LocalDateTime
import java.util.UUID

data class GroupMember (
    val id: UUID = UUID.randomUUID(),
    val groupId: UUID,
    val userID: UUID,
    val role: GroupRole = GroupRole.MEMBER,
    val joinedAt: LocalDateTime = LocalDateTime.now()
)