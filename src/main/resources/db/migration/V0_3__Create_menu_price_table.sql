create table if not exists "menu_price"
(
    id             serial
        constraint pk_menu_price primary key,
    id_menu        int,
    constraint fk_menu foreign key (id_menu) references "menu" (id),
    value          double precision not null   default 0.0,
    price_datetime timestamp without time zone default current_timestamp
)