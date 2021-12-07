SELECT * FROM categoria;

SELECT * FROM produto;

SELECT *  FROM categoria WHERE descricao IS NOT NULL

SELECT id,nome,preco FROM produto WHERE nome LIKE 'c%';

SELECT p.id,p.nome,p.nome,c.id,c.nome,c.descricao FROM categoria AS c JOIN produto AS p ON p.preco<0; 

SELECT id,nome,descricao,codigo,preco,categoria_id FROM produto JOIN categoria AS c ON c.id<2;

SELECT * FROM produto AS p JOIN categoria AS c ON p.id=c.id; 

