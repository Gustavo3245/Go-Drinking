package Api.GoDrinking.domain.entities

import Api.GoDrinking.domain.enums.VolumeUnit
import Api.GoDrinking.domain.value_objects.Volume
import java.util.UUID

data class RecipeItem(
    val id: UUID = UUID.randomUUID(),
    val ingredient: Ingredient,
    val quantity: Volume,
    val unit: VolumeUnit
)
