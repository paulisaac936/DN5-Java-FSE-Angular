package com.example;

import org.junit.platform.suite.api.*;

@Suite
@SelectClasses({
    CalculatorTest.class,
    EvenCheckerTest.class
})
public class AllTests {

}
