CREATE TYPE volume_unit_enum AS ENUM ( 'ML', 'OZ', 'GRAMS');

CREATE TYPE invitation_status AS ENUM ('Pending', 'Accepted', 'Declined');

CREATE TYPE member_position AS ENUM ('Admin', 'Member');