create table if not exists Income (
    id bigserial primary key,
    title text unique not null,
    plannedAmount text not null,
    remainingAmount text not null,
    year integer not null,
    month integer not null,
    day integer not null
);
