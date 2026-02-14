package Api.GoDrinking.domain.entities

import Api.GoDrinking.domain.value_objects.Name
import Api.GoDrinking.domain.value_objects.Url
import java.time.LocalDateTime
import java.util.UUID

data class Group(
    val id: UUID = UUID.randomUUID(),
    val name: Name,           // Value Object Validado
    val description: String?, // texto Opcional
    val iconUrl: Url?,        // Value Object validado com java.net.Url
    val creatorId: UUID,      // Referencia ao User que criou o grupo
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updateAt: LocalDateTime = LocalDateTime.now()

)