package Api.GoDrinking.domain.entities

import Api.GoDrinking.domain.enums.VolumeUnit
import Api.GoDrinking.domain.value_objects.Volume

data class RecipeItem(
    val ingredient: Ingredient,
    val quantity: Volume,
    val unit: VolumeUnit
)
