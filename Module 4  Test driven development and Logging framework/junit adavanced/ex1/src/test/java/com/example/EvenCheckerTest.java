package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenCheckerTest {

    EvenChecker e = new EvenChecker();

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8,10})
    void testEven(int number){

        assertTrue(
            e.isEven(number)
        );
    }
}