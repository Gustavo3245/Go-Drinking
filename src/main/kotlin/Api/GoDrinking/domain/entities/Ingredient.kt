package Api.GoDrinking.domain.entities

import java.util.UUID

data class Ingredient(
    val id: UUID,
    val name: String,
    val category: String
)
