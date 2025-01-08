USE DB_RH
GO

-- 1. Buscando TODOS os registros da tabela
SELECT * FROM TB_AREAS

-- 2. Buscando apenas a descrição da área
SELECT DESCRICAO FROM TB_AREAS

SELECT DISTINCT DESCRICAO FROM TB_AREAS

SELECT DISTINCT ID, DESCRICAO FROM TB_AREAS
GO

-- 3. Buscando uma área com base no ID informado (restrições - constraints)
SELECT * FROM TB_AREAS WHERE ID = 3

SELECT * FROM TB_AREAS WHERE ID < 3

SELECT * FROM TB_AREAS WHERE ID > 3 AND ID <> 4 -- DIFERENTE: <>
GO

-- 4. Buscando todas as áreas cuja descrição seja uma substring
SELECT * FROM TB_AREAS WHERE DESCRICAO = 'Financeiro'

SELECT * FROM TB_AREAS WHERE DESCRICAO LIKE 'F%'

SELECT * FROM TB_AREAS WHERE DESCRICAO LIKE 'F%' OR DESCRICAO LIKE 'M%'

SELECT * FROM TB_AREAS WHERE DESCRICAO LIKE '%o'

SELECT * FROM TB_AREAS WHERE DESCRICAO LIKE '%NI%'