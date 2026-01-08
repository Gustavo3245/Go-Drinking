package Api.GoDrinking.domain.entities

import java.net.URL
import java.util.UUID

data class Drink(
    val id: UUID, //identifier (Entity)
    val name: String,
    val preparationMethod: String,
    val alcoholContent: AlcoholContent,
    val ingredients: List<Ingredient>,
    val volume: DrinkVolume,
    val urlImage: URL
)
