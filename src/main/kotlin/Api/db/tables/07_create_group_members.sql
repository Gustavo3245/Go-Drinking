CREATE TABLE IF NOT EXISTS "group_members" (
    id UUID PRIMARY KEY
    user_id UUID NOT NULL,
    group_id UUID NOT NULL,
    positions member_position DEFAULT 'Member',

    joined_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,

    FOREIGN KEY ("user_id") REFERENCES "user" ("id") ON DELETE CASCADE,
    FOREIGN KEY ("group_id") REFERENCES "group" ("id") ON DELETE CASCADE,
);