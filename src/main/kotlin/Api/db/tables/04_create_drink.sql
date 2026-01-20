CREATE TABLE IF NOT EXISTS "drink" (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name VARCHAR(100) NOT NULL DEFAULT 'Drink',

    preparation_method TEXT,
    alcohol_content DOUBLE PRECISION NOT NULL,
    url_img TEXT,

    volume_value DOUBLE PRECISION NOT NULL DEFAULT 1,

    CONSTRAINT check_alcohol_range CHECK (alcohol_content >= 0 AND alcohol_content <= 100)
)