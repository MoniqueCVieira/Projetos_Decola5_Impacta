USE DB_FINTECH
GO


CREATE TRIGGER trg_after_transaction_insert
ON TB_TRANSACOES
AFTER INSERT
AS
BEGIN
    DECLARE 
        @ID_CONTA INT, 
        @VALOR DECIMAL, 
        @TIPO_TRANSACAO SMALLINT, 
        @SALDO_ANTERIOR DECIMAL, 
        @SALDO_POSTERIOR DECIMAL;

    -- Obtém os dados da transação inserida
    SELECT 
        @ID_CONTA = ID_CONTA, 
        @VALOR = VALOR, 
        @TIPO_TRANSACAO = TIPO_TRANSACAO
    FROM INSERTED;

    -- Obtém o saldo atual da conta de origem antes da transação
    SELECT @SALDO_ANTERIOR = SALDO 
    FROM TB_CONTAS
    WHERE ID = @ID_CONTA;

    -- Verifica se a transação pode ser realizada (verificação de saldo para saques, Pix, transferências, etc.)
    IF (@TIPO_TRANSACAO IN (2, 3, 4, 5, 6)) -- Tipos de transações que retiram saldo
    BEGIN
        IF @SALDO_ANTERIOR < @VALOR
        BEGIN
            -- Caso o saldo seja insuficiente, realiza o rollback da transação
            RAISERROR('Saldo insuficiente para realizar a transação.', 16, 1);
            ROLLBACK TRANSACTION;
            RETURN;
        END
    END

    -- Calcula o saldo posterior com base no tipo de transação
    IF @TIPO_TRANSACAO = 1 -- Depósito
    BEGIN
        SET @SALDO_POSTERIOR = @SALDO_ANTERIOR + @VALOR;
    END
    ELSE IF @TIPO_TRANSACAO IN (2, 3, 4, 5) -- Saque, PIX, Boleto, Débito
    BEGIN
        SET @SALDO_POSTERIOR = @SALDO_ANTERIOR - @VALOR;
    END
    ELSE IF @TIPO_TRANSACAO = 6 -- Transferência
    BEGIN
        -- Para transferências, o saldo será diminuído da conta de origem
        SET @SALDO_POSTERIOR = @SALDO_ANTERIOR - (@VALOR + 13); -- Deduz a taxa de 13 reais para transferência
    END

    -- Atualiza o saldo da conta de origem
    UPDATE TB_CONTAS
    SET SALDO = @SALDO_POSTERIOR
    WHERE ID = @ID_CONTA;

    -- Insere o registro no extrato da conta de origem
    INSERT INTO TB_EXTRATO (ID_CONTA, ID_TRANSACAO, SALDO_ANTERIOR, SALDO_POSTERIOR)
    VALUES (@ID_CONTA, (SELECT ID FROM INSERTED), @SALDO_ANTERIOR, @SALDO_POSTERIOR);

END
GO

CREATE TRIGGER trg_after_tranferencia_insert
ON TB_TRANSFERENCIAS
AFTER INSERT
AS
BEGIN
    DECLARE 
        @ID_CONTA INT,
		@ID_TRANSACAO INT,
        @VALOR DECIMAL, 
        @TIPO_TRANSACAO SMALLINT, 
        @SALDO_ANTERIOR DECIMAL, 
        @SALDO_POSTERIOR DECIMAL,
        @ID_CONTA_DESTINO INT;  -- ID da conta de destino

		-- Obtém o ID_CONTA_DESTINO da tabela TB_TRANSFERENCIAS
        SELECT 
			@ID_CONTA_DESTINO = ID_CONTA_DESTINO,
			@ID_TRANSACAO = ID_TRANSACAO
        FROM INSERTED;

		-- Obtém os dados da transação inserida
		SELECT 
			@ID_CONTA = ID_CONTA, 
			@VALOR = VALOR, 
			@TIPO_TRANSACAO = TIPO_TRANSACAO
		FROM TB_TRANSACOES
		WHERE ID = @ID_TRANSACAO;

        -- Se a conta de destino não for encontrada, gera erro
        IF @ID_CONTA_DESTINO IS NULL
        BEGIN
            RAISERROR('Conta de destino não encontrada.', 16, 1);
            ROLLBACK TRANSACTION;
            RETURN;
        END

        -- Obtém o saldo da conta de destino
        SELECT @SALDO_ANTERIOR = SALDO 
        FROM TB_CONTAS
        WHERE ID = @ID_CONTA_DESTINO;

        -- Adiciona o valor à conta de destino
        SET @SALDO_POSTERIOR = @SALDO_ANTERIOR + @VALOR;

        -- Atualiza o saldo da conta de destino
        UPDATE TB_CONTAS
        SET SALDO = @SALDO_POSTERIOR
        WHERE ID = @ID_CONTA_DESTINO;

        -- Insere o registro no extrato da conta de destino
        INSERT INTO TB_EXTRATO (ID_CONTA, ID_TRANSACAO, SALDO_ANTERIOR, SALDO_POSTERIOR)
        VALUES (@ID_CONTA_DESTINO, @ID_TRANSACAO, @SALDO_ANTERIOR, @SALDO_POSTERIOR);
END
GO

CREATE TRIGGER trg_after_pix_insert
ON TB_PIX
AFTER INSERT
AS
BEGIN
    DECLARE 
        @ID_CONTA INT,
		@ID_TRANSACAO INT,
        @VALOR DECIMAL, 
        @TIPO_TRANSACAO SMALLINT, 
        @SALDO_ANTERIOR DECIMAL, 
        @SALDO_POSTERIOR DECIMAL,
        @CHAVE_DESTINO VARCHAR(50);  -- ID da conta de destino

		-- Obtém o ID_CONTA_DESTINO da tabela TB_TRANSFERENCIAS
        SELECT 
			@CHAVE_DESTINO = CHAVE_DESTINO,
			@ID_TRANSACAO = ID_TRANSACAO
        FROM INSERTED;

		-- Obtém os dados da transação inserida
		SELECT 
			@ID_CONTA = ID_CONTA, 
			@VALOR = VALOR, 
			@TIPO_TRANSACAO = TIPO_TRANSACAO
		FROM TB_TRANSACOES
		WHERE ID = @ID_TRANSACAO;

        -- Se a conta de destino não for encontrada, gera erro
        IF @CHAVE_DESTINO IS NULL
        BEGIN
            RAISERROR('Chave PIX de destino não encontrada.', 16, 1);
            ROLLBACK TRANSACTION;
            RETURN;
        END

        -- Obtém o saldo da conta de destino
        SELECT @ID_CONTA = ID_CONTA
        FROM TB_CHAVES_PIX
        WHERE CHAVE = @CHAVE_DESTINO;

		SELECT @SALDO_ANTERIOR = SALDO
		FROM TB_CONTAS
		WHERE ID = @ID_CONTA;

        -- Adiciona o valor à conta de destino
        SET @SALDO_POSTERIOR = @SALDO_ANTERIOR + @VALOR;

        -- Atualiza o saldo da conta de destino
        UPDATE TB_CONTAS
        SET SALDO = @SALDO_POSTERIOR
        WHERE ID = @ID_CONTA;

        -- Insere o registro no extrato da conta de destino
        INSERT INTO TB_EXTRATO (ID_CONTA, ID_TRANSACAO, SALDO_ANTERIOR, SALDO_POSTERIOR)
        VALUES (@ID_CONTA, @ID_TRANSACAO, @SALDO_ANTERIOR, @SALDO_POSTERIOR);
END
GO