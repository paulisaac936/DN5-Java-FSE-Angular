package com.example;

public class BankService {

    private BankApi api;

    public BankService(BankApi api) {
        this.api = api;
    }

    public void processTransaction() {

        api.login();

        api.transfer();

        api.logout();
    }
}