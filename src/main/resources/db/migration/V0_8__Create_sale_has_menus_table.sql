create table if not exists "sale_has_menus" (
    id serial
        constraint pk_sale_has_menu primary key,
    id_sale int,
    constraint fk_sale foreign key (id_sale) references "sale" (id),
    id_menu int,
    constraint fk_menu foreign key (id_menu) references "menu" (id),
    quantity int not null default 0
)