CREATE OR REPLACE FUNCTION
CalculateMonthlyInstallment(
    p_loan_amount NUMBER,
    p_interest_rate NUMBER,
    p_years NUMBER
)
RETURN NUMBER
IS
    v_monthly NUMBER;
BEGIN
    v_monthly :=
        (p_loan_amount +
        (p_loan_amount *
         p_interest_rate *
         p_years / 100))
        / (p_years * 12);

    RETURN ROUND(v_monthly,2);
END;
/
