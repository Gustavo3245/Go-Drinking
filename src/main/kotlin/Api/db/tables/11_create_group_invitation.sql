CREATE TABLE IF NOT EXISTS "group_invitation" (
    id UUID PRIMARY KEY,

    group_id UUID NOT NULL,
    sender_id UUID NOT NULL,
    recipient_id UUID NOT NULL,

    status invitation_status DEFAULT 'Pending',
    created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    expired_at TIMESTAMP

    FOREIGN KEY ("group_id") REFERENCES "group" ("id") ON DELETE CASCADE,
    FOREIGN KEY ("sender_id") REFERENCES "user" ("id"),
    FOREIGN KEY ("recipient_id") REFERENCES "user" ("id"),

    CONSTRAINT check_not_self_invite CHECK (sender_id <> recipient_id)
);