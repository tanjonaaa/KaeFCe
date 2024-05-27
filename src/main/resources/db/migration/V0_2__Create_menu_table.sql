create table if not exists "menu"
(
    id   serial
        constraint pk_menu primary key,
    name varchar not null
);