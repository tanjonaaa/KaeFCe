create table if not exists "measurement_unit" (
    id serial
        constraint pk_measurement_unit primary key,
    name varchar not null
)