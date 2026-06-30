package com.example;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    void testVerifyInteraction() {

        // create fake API
        ExternalApi mockApi =
                mock(
                    ExternalApi.class
                );

        // inject fake API
        MyService service =
                new MyService(
                    mockApi
                );

        // call service
        service.fetchData();

        // verify API call
        verify(mockApi)
                .getData();
    }
}