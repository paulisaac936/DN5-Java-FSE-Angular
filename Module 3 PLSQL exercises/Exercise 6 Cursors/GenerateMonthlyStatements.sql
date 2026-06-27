DECLARE
    CURSOR GenerateMonthlyStatements IS
        SELECT TransactionID,
               AccountID,
               Amount,
               TransactionDate
        FROM Transactions
        WHERE TRUNC(TransactionDate,'MM')
              = TRUNC(SYSDATE,'MM');

    v_trans GenerateMonthlyStatements%ROWTYPE;
BEGIN
    OPEN GenerateMonthlyStatements;

    LOOP
        FETCH GenerateMonthlyStatements
        INTO v_trans;

        EXIT WHEN GenerateMonthlyStatements%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE(
            'Transaction ID: '
            || v_trans.TransactionID
            || ' Account: '
            || v_trans.AccountID
            || ' Amount: '
            || v_trans.Amount
        );
    END LOOP;

    CLOSE GenerateMonthlyStatements;
END;
/
