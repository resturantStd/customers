CREATE TABLE IF NOT EXISTS customers
(
    id    BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    email VARCHAR(255),
    CONSTRAINT pk_customers PRIMARY KEY (id)
);