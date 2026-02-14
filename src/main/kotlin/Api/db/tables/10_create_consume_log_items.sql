CREATE TABLE IF NOT EXISTS "consume_log_items" (
    id UUID PRIMARY KEY,
    consume_log_id UUID NOT NULL,
    drink_id UUID NOT NULL,

    unit_quantity INTEGER NOT NULL DEFAULT 1,
    volume_per_unit DOUBLE PRECISION NOT NULL,

    FOREIGN KEY ("drink_id") REFERENCES "drink" ("id"),
    FOREIGN KEY ("consume_log_id") REFERENCES "consume_log" ("id") ON DELETE CASCADE
);