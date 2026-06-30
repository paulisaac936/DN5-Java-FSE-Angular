package com.example;

import org.junit.jupiter.api.*;

@TestMethodOrder(
    MethodOrderer.OrderAnnotation.class
)
public class OrderedTests {

    @Test
    @Order(1)
    void login() {
        System.out.println("Login");
    }

    @Test
    @Order(2)
    void transfer() {
        System.out.println("Transfer");
    }

    @Test
    @Order(3)
    void logout() {
        System.out.println("Logout");
    }
}