package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExceptionThrowerTest {

    @Test
    void testException() {

        ExceptionThrower e =
                new ExceptionThrower();

        assertThrows(
            ArithmeticException.class,
            () -> e.throwException()
        );
    }
}