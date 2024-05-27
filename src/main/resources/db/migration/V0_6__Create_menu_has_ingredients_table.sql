create table if not exists "menu_has_ingredients"
(
    id            serial
        constraint pk_menu_has_ingredients primary key,
    id_ingredient int,
    constraint fk_ingredient foreign key (id_ingredient) references "ingredient" (id),
    id_menu       int,
    constraint fk_menu foreign key (id_menu) references "menu" (id),
    quantity      double precision not null default 0.0
)