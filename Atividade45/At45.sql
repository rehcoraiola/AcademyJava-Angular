BEGIN TRANSACTION;

	INSERT INTO pais(id,nome,sigla)VALUES(1,'Brasil','BR');

	INSERT INTO estado(id,nome,pais_id)VALUES(2,'Paraná',1);
	INSERT INTO estado(id,nome,pais_id)VALUES(3,'Santa Catarina',2);
	INSERT INTO estado(id,nome,pais_id)VALUES(1,'São Paulo',3);

	INSERT INTO cidade(id,nome,estado_id)VALUES(1,'Curitiba',1);
	INSERT INTO cidade(id,nome,estado_id)VALUES(2,'Colombo',1);
	INSERT INTO cidade(id,nome,estado_id)VALUES(3,'Blumenau',2);
	INSERT INTO cidade(id,nome,estado_id)VALUES(4,'Florianopolis',2);
	INSERT INTO cidade(id,nome,estado_id)VALUES(5,'São Paulo',3);
	INSERT INTO cidade(id,nome,estado_id)VALUES(6,'Guarulhos',3);

COMMIT;
END;

BEGIN TRANSACTION;
	SELECT c.id AS "ID Cidade",c.nome,e.id AS "ID Estado",e.nome,p.id AS "ID Pais",p.sigla 
	FROM cidade AS c JOIN estado AS e ON pais AS p;

	--SELECT c.id AS "ID Cidade",c.nome,e.id AS "ID Estado",e.nome,p.id AS "ID Pais",p.sigla 
	FROM cidade AS c inner JOIN estado AS e ON c.estado_id=e.id INNER JOIN pais AS p ON p.id=p.id;

COMMIT;
END;


