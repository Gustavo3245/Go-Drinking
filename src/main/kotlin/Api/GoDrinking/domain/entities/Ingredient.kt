package Api.GoDrinking.domain.entities

import Api.GoDrinking.domain.enums.IngredientCategory
import Api.GoDrinking.domain.value_objects.Name
import java.util.UUID

data class Ingredient(
    val id: UUID = UUID.randomUUID(),
    val name: Name,
    val category: IngredientCategory
)
