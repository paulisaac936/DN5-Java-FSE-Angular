package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.Duration;

public class PerformanceTesterTest {

    @Test
    void testTimeout() {

        PerformanceTester p =
                new PerformanceTester();

        assertTimeout(
            Duration.ofSeconds(5),
            () -> p.performTask()
        );
    }
}