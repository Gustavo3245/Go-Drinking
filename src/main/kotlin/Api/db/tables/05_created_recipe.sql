CREATE TABLE IF NOT EXISTS "recipe" (
    id UUID PRIMARY KEY,
    quantity DOUBLE PRECISION NOT NULL,
    unit volume_unit_enum NOT NULL,
    ingredient_id UUID NOT NULL,
    drink_id UUID NOT NULL,

    FOREIGN KEY ("ingredient_id") REFERENCES "ingredient" ("id") ON DELETE RESTRICT,
    FOREIGN KEY ("drink_id") REFERENCES "drink" ("id") ON DELETE CASCADE
);

/*
    Essa é uma tabela intermediaria da relação ingredient -> drink
    um drink pode está presente em uma ou mais bebidas,
    uma bebida contem um ou mais ingredients.
    recipe deve possui 3 campos principais, quantity, unit e ingredient_id compondo complemente
    a funcionalidade necessaria de apresentar o recipo de ingrediente completo.

    ex: 20g de Limão: 20 -> quantity, g -> unit, Limão -> nome do ingredient.

*/
