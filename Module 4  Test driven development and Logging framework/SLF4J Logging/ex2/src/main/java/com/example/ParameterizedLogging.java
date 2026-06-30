package com.example;

/**
 * Hello world!
 *
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLogging {

    private static final Logger logger =
            LoggerFactory.getLogger(
                    ParameterizedLogging.class);

    public static void main(String[] args) {

        String name = "Isaac";
        int salary = 50000;

        logger.info(
                "Employee {} has salary {}",
                name,
                salary);

        logger.warn(
                "Employee {} has low attendance",
                name);
    }
}