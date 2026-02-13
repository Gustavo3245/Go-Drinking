CREATE TABLE IF NOT EXISTS "event" (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    creator_id UUID NOT NULL,
    group_id UUID,
    location_id UUID NOT,

    name VARCHAR(100) NOT NULL,
    type event_type NOT NULL,

    created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    update_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    deleted_at TIMESTAMP,

    FOREIGN KEY ("creator_id") REFERENCES "user" ("id") ON DELETE CASCADE,
    FOREIGN KEY ("group_id") REFERENCES "group" ("id") ON DELETE SET NULL,
    FOREIGN KEY ("location_id") REFERENCES "location" ("id"),

    CONSTRAINT check_group_event_consistency CHECK (
        (type = 'GROUP' AND group_id IS NOT NULL) OR
        (type = 'INDIVIDUAL' AND group_id IS NULL)
    )

)