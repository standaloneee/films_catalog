CREATE TABLE "biba"
(
    "id" uuid primary key,
    "biba_name" varchar(255),
    "age" int,
    "woman" bool,
    "aboba_id" uuid
);

CREATE TABLE "aboba"
(
    "id" uuid primary key,
    "name" varchar(255),
    "age" int
);
