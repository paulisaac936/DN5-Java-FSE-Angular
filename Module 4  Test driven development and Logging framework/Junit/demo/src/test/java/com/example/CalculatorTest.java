package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CalculatorTest {

    Calculator c;

    @BeforeEach
    void setup() {
        c = new Calculator();
        System.out.println("Setup");
    }

    @AfterEach
    void cleanup() {
        System.out.println("Cleanup");
    }

    @Test
    void testAdd() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = c.add(a,b);

        // Assert
        assertEquals(30,result);
    }
}