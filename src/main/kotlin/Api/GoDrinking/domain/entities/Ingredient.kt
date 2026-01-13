package Api.GoDrinking.domain.entities

import Api.GoDrinking.domain.value_objects.Name
import java.util.UUID

data class Ingredient(
    val id: UUID,
    val name: Name,
    val category: String
)
