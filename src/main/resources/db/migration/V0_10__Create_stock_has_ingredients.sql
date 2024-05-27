create table if not exists "stock_has_ingredients" (
    id serial
        constraint pk_stock_has_ingredients primary key,
    id_stock int,
    constraint fk_stock foreign key (id_stock) references "stock" (id),
    id_ingredient int,
    constraint fk_ingredient foreign key (id_ingredient) references "ingredient" (id),
    quantity double precision not null default 0.0
)