create table if not exists "ingredient" (
    id serial
        constraint pk_ingredient primary key,
    name varchar not null,
    unit_price double precision not null default 0.0,
    id_measurement_unit int,
    constraint fk_measurement_unit foreign key (id_measurement_unit) references "measurement_unit" (id)
)