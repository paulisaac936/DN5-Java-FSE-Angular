package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CalculatorServiceTest {

    @Test
    void testArgumentMatcher() {

        // create fake calculator
        Calculator calc =
                mock(
                    Calculator.class
                );

        // inject fake calculator
        CalculatorService service =
                new CalculatorService(
                    calc
                );

        // call service
        service.calculate();

        // verify using argument matcher
        verify(calc)
                .add(
                    anyInt(),
                    anyInt()
                );
    }
}