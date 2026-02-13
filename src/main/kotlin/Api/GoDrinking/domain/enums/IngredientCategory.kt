package Api.GoDrinking.domain.enums

enum class IngredientCategory(val description: String) {
    DISTILLED("High-alcohol spirits like Vodka, Gin, Cachaça"),
    FERMENTED("Beer, Wine, and Cider"),
    LIQUEUR("Sweet and flavored alcoholic spirits"),
    SYRUP_SWEETENER("Sugar, Honey, Fruit syrups"),
    FRUIT_VEGETABLE("Lemon, Mint, Fresh fruits"),
    NON_ALCOHOLIC_MIXER("Tonic water, Sodas, Juices"),
    BITTER_SPICE("Concentrated flavorings and bitters"),
    GARNISH("Ice, Fruit peels, Edible straws")
}