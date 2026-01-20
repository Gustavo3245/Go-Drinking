CREATE TABLE IF NOT EXISTS "event" (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    creator_id UUID NOT NULL,
    group_id UUID NOT NULL,
    location_id UUID NOT NULL,

    name VARCHAR(100) NOT NULL,
    type event_type NOT NULL,

    created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    update_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    deleted_at TIMESTAMP
)