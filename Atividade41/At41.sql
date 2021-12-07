 create table produto(
 	id integer PRIMARY KEY generated always as IDENTITY not null
 	,nome varchar(25) not null
 	,descricao varchar(200) not null
 	,codigo varchar(20) not null
 	,preco float not null		--REAL, double, numeric(4,5), decimal(5,2)
 );
COMMIT;

 create table categoria(
 	id integer PRIMARY KEY generated always as IDENTITY not null
 	,nome varchar(25) not null
 	,descricao varchar(200) null
 );


  create table carro(
 	id integer not null generated always as identity
 	,modelo varchar(25) not null
 	,marca varchar(200) not null
 );
 
alter table carro add column chassi varchar(30) not null;
alter table carro add column ano varchar(10) not null;

alter table produto drop column codigo;

drop table carro;

alter table produto add column categoria_id int NOT NULL;
ALTER TABLE produto ADD CONSTRAINT fk_categoria FOREIGN key(categoria_id) REFERENCES categoria(id);

DROP TABLE produtos;