CREATE TABLE customer (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL CHECK (char_length(name) >= 1)
);