package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    void testExternalApi() {

        // Create fake API
        ExternalApi mockApi =
                mock(ExternalApi.class);

        // Tell Mockito what to return
        when(mockApi.getData())
                .thenReturn("Mock Data");

        // Inject fake API
        MyService service =
                new MyService(mockApi);

        // Call service
        String result =
                service.fetchData();

        // Verify result
        assertEquals(
                "Mock Data",
                result
        );
    }
}