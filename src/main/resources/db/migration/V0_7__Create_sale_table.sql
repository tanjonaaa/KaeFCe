create table if not exists "sale" (
    id serial
        constraint pk_sale primary key,
    sale_datetime timestamp without time zone not null default current_timestamp,
    id_restaurant int,
    constraint fk_restaurant foreign key (id_restaurant) references "restaurant" (id)
)