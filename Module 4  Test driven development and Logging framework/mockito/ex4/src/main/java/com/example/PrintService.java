package com.example;

public class PrintService {

    private Printer printer;

    public PrintService(Printer printer) {
        this.printer = printer;
    }

    public void printMessage() {

        printer.print(
                "Hello Mockito"
        );
    }
}