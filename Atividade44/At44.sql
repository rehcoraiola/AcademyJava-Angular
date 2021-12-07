BEGIN TRANSACTION;
	INSERT INTO categoria(id,nome,descricao)VALUES(1,'Carnes','ave, bovina');
	INSERT INTO categoria(id,nome,descricao)VALUES(2,'Frutas','banana, abacaxi');
COMMIT;
END;

BEGIN TRANSACTION;
	INSERT INTO categoria(id,nome,descricao)VALUES(4,'Oleos','Leve');
	INSERT INTO produto(id,nome,descricao,codigo,preco,categoria_id)VALUES(1,'Banana','Prata','98937RD',12.0,7);
COMMIT;
END;

--Slide 2
BEGIN TRANSACTION;

	CREATE TABLE carros(
		id int PRIMARY KEY generation ALWAYS AS Identitu nor NULL
		,marca varchar(50) NOT NULL
		,modelo varchar(100) NOT NULL
	)

	INSERT INTO carros(id,marca,modelo)VALUES(1,'GM','Gol');
	INSERT INTO carros(id,marca,modelo)VALUES(2,'BMW','X5');
COMMIT;
END;


BEGIN TRANSACTION;
	CREATE TABLE pais(
			id int PRIMARY KEY generation ALWAYS AS Identitu nor NULL
			,nome varchar(50) NOT NULL
			,sigla varchar(100) NOT NULL 
		);
	CREATE TABLE estado(
			id int PRIMARY KEY generation ALWAYS AS Identitu nor NULL
			,nome varchar(50) NOT NULL
			,pais_id int NOT NULL
			,CONSTRAINT fk_pais FOREIGN KEY(pais_id) REFERENCES pais(id);
		);
 	CREATE TABLE cidade(
			id int PRIMARY KEY generation ALWAYS AS Identitu nor NULL
			,nome varchar(50) NOT NULL
			,estado_id int NOT NULL
			,CONSTRAINT fk_estado FOREIGN KEY(estado_id) REFERENCES estado(id);
		);
	
	
	INSERT INTO pais(id,nome,sigla)VALUES(1,'Brasil','BR');
	INSERT INTO estado(id,nome,pais_id)VALUES(2,'Paraná',1);
	INSERT INTO cidade(id,nome,estado_id)VALUES(1,'Curitiba',2);

COMMIT;
END;
