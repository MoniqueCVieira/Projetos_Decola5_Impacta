USE DB_RH
GO

-- 1. Exemplos de funções de agregação
SELECT * FROM TB_CARGOS

SELECT
	SUM(SALARIO) AS SOMA,
	AVG(SALARIO) AS MEDIA,
	MAX(SALARIO) AS MAXIMO,
	MIN(SALARIO) AS MINIMO,
	COUNT(SALARIO) AS QUANTIDADE,
	STDEV(SALARIO) AS [DESVIO PADRAO]
FROM TB_CARGOS
GO




-- 2. Usamos GROUP BY para agrupar os resultados usando os valores das colunas agrupadas
SELECT
	SUM(SALARIO) AS SOMA,
	AVG(SALARIO) AS MEDIA,
	MAX(SALARIO) AS MAXIMO,
	MIN(SALARIO) AS MINIMO,
	COUNT(SALARIO) AS QUANTIDADE,
	STDEV(SALARIO) AS [DESVIO PADRAO]
FROM TB_CARGOS
GROUP BY TP_SALARIO
GO




-- 3. Quando desejamos exibir o valor de outras colunas que não façam parte da agregação,
-- estas devem ser agrupadas
SELECT
	SUM(SALARIO) AS SOMA,
	AVG(SALARIO) AS MEDIA,
	MAX(SALARIO) AS MAXIMO,
	MIN(SALARIO) AS MINIMO,
	COUNT(SALARIO) AS QUANTIDADE,
	STDEV(SALARIO) AS [DESVIO PADRAO],
	TP_SALARIO AS [TIPO SALARIO]
FROM TB_CARGOS
GROUP BY TP_SALARIO
GO




-- 4. Usando uma consulta com todas as tabelas, incluindo junções e agrupamentos
SELECT
	A.DESCRICAO AS AREA,
	C.DESCRICAO AS CARGO,
	SUM(C.SALARIO) AS [SOMA SALÁRIO],
	COUNT(*) AS QUANTIDADE,
	C.TP_SALARIO AS TIPO,
	I.DATA_INSCRICAO AS DATA,
	CD.CPF AS CPF,
	CD.NOME AS NOME
FROM
	TB_AREAS A JOIN TB_CARGOS C
		ON A.ID = C.ID_AREA
	JOIN TB_INSCRICOES I
		ON C.ID = I.ID_CARGO
	JOIN TB_CANDIDATOS CD
		ON I.CPF = CD.CPF
GROUP BY 
	A.DESCRICAO, C.DESCRICAO, C.TP_SALARIO, I.DATA_INSCRICAO, CD.CPF, CD.NOME
GO




-- AREA, CARGO, QUANTIDADE, CPF E NOME
SELECT
	A.DESCRICAO AS AREA,
	C.DESCRICAO AS CARGO,
	-- SUM(C.SALARIO) AS [SOMA SALÁRIO],
	COUNT(*) AS QUANTIDADE,
	-- C.TP_SALARIO AS TIPO,
	-- I.DATA_INSCRICAO AS DATA,
	CD.CPF AS CPF,
	CD.NOME AS NOME
FROM
	TB_AREAS A JOIN TB_CARGOS C
		ON A.ID = C.ID_AREA
	JOIN TB_INSCRICOES I
		ON C.ID = I.ID_CARGO
	JOIN TB_CANDIDATOS CD
		ON I.CPF = CD.CPF
GROUP BY 
	A.DESCRICAO, 
	C.DESCRICAO, 
	-- C.TP_SALARIO, 
	-- I.DATA_INSCRICAO, 
	CD.CPF, 
	CD.NOME
GO







-- Exercício 1: Quantidade de inscrições por candidato [QUANTIDADE, CPF E NOME]

SELECT
	-- A.DESCRICAO AS AREA,
	-- C.DESCRICAO AS CARGO,
	-- SUM(C.SALARIO) AS [SOMA SALÁRIO],
	COUNT(*) AS QUANTIDADE,
	-- C.TP_SALARIO AS TIPO,
	-- I.DATA_INSCRICAO AS DATA,
	CD.CPF AS CPF,
	CD.NOME AS NOME
FROM
	TB_AREAS A JOIN TB_CARGOS C
		ON A.ID = C.ID_AREA
	JOIN TB_INSCRICOES I
		ON C.ID = I.ID_CARGO
	JOIN TB_CANDIDATOS CD
		ON I.CPF = CD.CPF
GROUP BY 
	-- A.DESCRICAO, 
	-- C.DESCRICAO, 
	-- C.TP_SALARIO, 
	-- I.DATA_INSCRICAO, 
	CD.CPF, 
	CD.NOME
GO




-- Exercício 2: Quantidade de inscrições por cargo
SELECT
	-- A.DESCRICAO AS AREA,
	-- C.DESCRICAO AS CARGO,
	-- SUM(C.SALARIO) AS [SOMA SALÁRIO],
	COUNT(*) AS QUANTIDADE,
	-- C.TP_SALARIO AS TIPO,
	-- I.DATA_INSCRICAO AS DATA,
	CD.CPF AS CPF,
	CD.NOME AS NOME
FROM
	TB_AREAS A JOIN TB_CARGOS C
		ON A.ID = C.ID_AREA
	JOIN TB_INSCRICOES I
		ON C.ID = I.ID_CARGO
	JOIN TB_CANDIDATOS CD
		ON I.CPF = CD.CPF
GROUP BY 
	-- A.DESCRICAO, 
	-- C.DESCRICAO, 
	-- C.TP_SALARIO, 
	-- I.DATA_INSCRICAO, 
	CD.CPF, 
	CD.NOME
GO