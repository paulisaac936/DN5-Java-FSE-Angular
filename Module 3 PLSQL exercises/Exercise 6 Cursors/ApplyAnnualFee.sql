DECLARE
    CURSOR ApplyAnnualFee IS
        SELECT AccountID,
               Balance
        FROM Accounts;

    v_acc ApplyAnnualFee%ROWTYPE;
BEGIN
    OPEN ApplyAnnualFee;

    LOOP
        FETCH ApplyAnnualFee
        INTO v_acc;

        EXIT WHEN ApplyAnnualFee%NOTFOUND;

        UPDATE Accounts
        SET Balance = Balance - 100
        WHERE AccountID = v_acc.AccountID;

        DBMS_OUTPUT.PUT_LINE(
            'Annual fee applied to Account '
            || v_acc.AccountID
        );
    END LOOP;

    COMMIT;

    CLOSE ApplyAnnualFee;
END;
/
