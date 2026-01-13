package Api.GoDrinking.domain.entities

import Api.GoDrinking.domain.value_objects.AlcoholContent
import Api.GoDrinking.domain.value_objects.Name
import Api.GoDrinking.domain.value_objects.Volume
import Api.GoDrinking.domain.value_objects.PreparationMethod
import java.net.URL
import java.util.UUID

data class Drink(
    val id: UUID, //identifier (Entity)
    val name: Name,
    val preparationMethod: PreparationMethod,
    val alcoholContent: AlcoholContent,
    val ingredients: List<RecipeItem>,
    val volume: Volume,
    val urlImage: URL
)
