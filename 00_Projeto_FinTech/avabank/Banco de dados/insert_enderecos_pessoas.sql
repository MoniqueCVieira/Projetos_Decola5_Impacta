USE DB_FINTECH
GO

INSERT INTO TB_ENDERECOS 
		(CEP, LOGRADOURO, COMPLEMENTO, BAIRRO, CIDADE, UF, ESTADO)
	VALUES
		('01001000', 'Praça da Sé', 'lado ímpar', 'Sé', 'São Paulo', 'SP', 'São Paulo'),
		('91040000', 'Rua Domingos Rubbo', '', 'Cristo Redentor', 'Porto Alegre', 'RS', 'Rio Grande do Sul'),
		('23812310', 'Rua São João', '', 'São José', 'Itaguaí', 'RJ', 'Rio de Janeiro'),
		('28000000', 'Avenida das Nações', 'Apto 305', 'Centro', 'Vitória', 'ES', 'Espírito Santo'),
		('32030000', 'Rua Tavares', '', 'São José', 'Serra', 'ES', 'Espírito Santo')
GO

INSERT INTO TB_PESSOAS
		(CPF, NOME, DATA_NASCIMENTO, EMAIL, TELEFONE, ID_ENDERECO)
	VALUES
		('13335563816', 'Felipe Thomas Iago Duarte', '2003-01-02', 'felipe-duarte85@hlt.arq.br', '1126668493', 1),
		('09769605085', 'Elias Renan Nicolas da Mata', '1997-01-06', 'elias_renan_damata@band.com', '51991559695', 2),
		('22508322776', 'Priscila Márcia Rocha', '1988-05-10', 'priscila-rocha73@emayl.com', '2135098626', 3),
		('88912345678', 'Carlos Alberto Silva', '1990-08-15', 'carlos.silva@tmail.com', '273654987', 4),
		('15789436509', 'Maria Beatriz Almeida', '1985-03-21', 'maria.almeida@mail.com', '278951623', 5)
GO

INSERT INTO TB_AGENCIAS 
		(NUMERO, NOME, RAZAO_SOCIAL, EMAIL) 
VALUES 
		('1234', 'Agência Centro - SP', 'Avabank S.A', 'centro.sp@avabank.com'),
		('4567', 'Agência Norte - SP', 'Avabank S.A', 'norte.sp@avabank.com'),
		('8910', 'Agência Recife - PE', 'Avabank S.A', 'recife.pe@avabank.com'),
		('1122', 'Agência Centro - RJ', 'Avabank S.A', 'centro.rj@avabank.com'),
		('3344', 'Agência Sul - SP', 'Avabank S.A', 'sul.sp@avabank.com')
GO

INSERT INTO TB_ADMINS 
		(ID_PESSOA, USERNAME, SENHA) 
VALUES
		(1, 'admin01', 'gerente01'),
		(2, 'admin02', 'seguro123')
GO

-- Insert TB_CLIENTES

INSERT INTO TB_CLIENTES 
		(ID_PESSOA, SENHA) 
VALUES 
		(3, 'minhasenha'),
		(4, 'abc12345'),
		(5, 'senha1234')
GO

INSERT INTO TB_CONTAS 
	(ID_AGENCIA, ID_CLIENTE, ID_ADMIN, NUMERO, TIPO, SALDO, DATA_ABERTURA, DATA_ENCERRAMENTO, DATA_ULTIMO_ACESSO, SITUACAO) 
VALUES 
	(1, 1, 1, '03227774', 1, 5289.00, GETDATE(), NULL, NULL, 1),
	(3, 2, 2, '16667072', 2, 224.00, '2025-01-03 12:00:00', NULL, '2025-01-07 13:52:58', 1),
	(5, 3, 1, '04567890', 1, 3200.50, GETDATE(), NULL, NULL, 1)
GO


INSERT INTO TB_CHAVES_PIX 
		(ID_CONTA, TIPO, CHAVE) 
VALUES 
		(1, 2, 'samaravitoria@avabank.com'),
		(2, 1, '00000022290')
GO