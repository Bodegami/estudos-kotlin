CREATE TABLE clientes(
    id bigint auto_increment primary key,
    nome varchar(255) not null,
    idade varchar(3) not null,
    email varchar(255) not null unique,
    telefone varchar(15) not null unique,
    endereco varchar(255) not null unique
);