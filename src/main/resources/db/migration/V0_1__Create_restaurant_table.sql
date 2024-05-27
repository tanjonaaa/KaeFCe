create table if not exists "restaurant"
(
    id   serial
        constraint pk_restaurant primary key,
    name varchar not null
);