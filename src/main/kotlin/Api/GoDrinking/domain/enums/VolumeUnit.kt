package Api.GoDrinking.domain.enums


// Definindo unidades básicas de medidas utilizadas em bebidas/coqueteis e drinks.
enum class VolumeUnit() {
    ML, L, OZ;

    companion object {
        fun fromString(value: String) = entries.find {it.name == value.uppercase()}
    }
}