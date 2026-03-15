create table if not exists BudgetEntry (
    id bigserial primary key,
    title text unique not null,
    budget_type text not null,
    planned_amount text not null,
    received_amount text not null,
    year integer not null,
    month integer not null,
    day integer not null
);
