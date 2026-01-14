CREATE TABLE IF NOT EXISTS "recipe" (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    quantity DOUBLE PRECISION NOT NULL,
    unit volume_unit_enum NOT NULL,
    ingredient_id UUID NOT NULL,
    drink_id UUID NOT NULL,

    FOREIGN KEY ("ingredient_id") REFERENCES "ingredient" ("id") ON DELETE CASCADE,
    FOREIGN KEY ("drink_id") REFERENCES "drink" ("id") ON DELETE RESTRICT

)
