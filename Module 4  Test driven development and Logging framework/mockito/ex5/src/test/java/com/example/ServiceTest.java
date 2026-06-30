package com.example;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class ServiceTest {

    @Test
    void testMultipleReturns() {

        // create fake repository
        Repository repo =
                mock(
                    Repository.class
                );

        // return different values
        when(
            repo.getData()
        )
        .thenReturn(
                "First Mock Data"
        )
        .thenReturn(
                "Second Mock Data"
        );

        // inject fake repository
        Service service =
                new Service(repo);

        // first call
        String first =
                service.processData();

        // second call
        String second =
                service.processData();

        // verify
        assertEquals(
                "Processed First Mock Data",
                first
        );

        assertEquals(
                "Processed Second Mock Data",
                second
        );
    }
}