package com.example;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class PrintServiceTest {

    @Test
    void testVoidMethod() {

        // create fake printer
        Printer printer =
                mock(
                    Printer.class
                );

        // do nothing when print() called
        doNothing()
                .when(printer)
                .print(anyString());

        // inject fake printer
        PrintService service =
                new PrintService(
                    printer
                );

        // call service
        service.printMessage();

        // verify
        verify(printer)
                .print(
                    "Hello Mockito"
                );
    }
}