package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingApp {

    private static final Logger logger =
            LoggerFactory.getLogger(
                    LoggingApp.class);

    public static void main(String[] args) {

        logger.debug(
                "Debug Message");

        logger.info(
                "Application Started");

        logger.warn(
                "Low Memory Warning");

        logger.error(
                "Database Connection Failed");
    }
}