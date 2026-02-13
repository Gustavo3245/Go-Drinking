package Api.GoDrinking.domain.enums

enum class UnitOfMeasure(val mlFactor: Double) {
    ML(1.0), LITRO(1000.0), DOSE(50.0), COPO(350.0), LATA(350.0);
}