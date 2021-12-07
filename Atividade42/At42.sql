INSERT INTO categoria(id,nome,descricao)VALUES(1,'Carnes','ave, bovina');
INSERT INTO categoria(id,nome,descricao)VALUES(2,'Frutas','banana, abacaxi');
INSERT INTO categoria(id,nome,descricao)VALUES(3,'Doces','chocolate, balas');


INSERT INTO produto(id,nome,descricao,codigo,preco,categoria_id)VALUES(1,'Banana','Prata','98937RD',12.0,2);
INSERT INTO produto(id,nome,descricao,codigo,preco,categoria_id)VALUES(2,'Chocolate','Lacta','18937RD',4.0,3);
INSERT INTO produto(id,nome,descricao,codigo,preco,categoria_id)VALUES(3,'Ave','Peito','64657RD',20.0,1);
INSERT INTO produto(id,nome,descricao,codigo,preco,categoria_id)VALUES(4,'Abacaxi','Prata','88937RD',12.0,2);
INSERT INTO produto(id,nome,descricao,codigo,preco,categoria_id)VALUES(5,'Trident','Menta','68937RD',4.0,3);
INSERT INTO produto(id,nome,descricao,codigo,preco,categoria_id)VALUES(6,'Maça','Verde','264657RD',20.0,2);

UPDATE produto SET descricao='Nestle' WHERE id=2;
UPDATE produto SET descricao='Coxa' WHERE id=3;

DELETE FROM produto WHERE id=3;
DELETE FROM categoria WHERE id=1;

UPDATE produto SET categoria_id=3 WHERE id=6;

UPDATE produto SET preco=preco-1.0;

