use wn;
create table estados(
Id int unsigned not null auto_increment,
nome varchar(45) not null,
sigla varchar(2) not null,
regiao ENUM ('Norte','Nordeste','Centro-Oeste','Sudeste','sul') not null,
populacao decimal(5,2) not null,
primary key(id),
unique key (nome),
unique key (sigla)
);

