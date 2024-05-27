create table if not exists "stock" (
    id serial
        constraint pk_stock primary key,
    stock_datetime timestamp without time zone default current_timestamp,
    id_restaurant int,
    constraint fk_restaurant foreign key (id_restaurant) references "restaurant" (id)
)