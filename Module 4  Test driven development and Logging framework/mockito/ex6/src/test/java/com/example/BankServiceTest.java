package com.example;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

public class BankServiceTest {

    @Test
    void testInteractionOrder() {

        // create fake api
        BankApi api =
                mock(
                    BankApi.class
                );

        // inject fake api
        BankService service =
                new BankService(api);

        // execute
        service.processTransaction();

        // create order verifier
        InOrder inOrder =
                inOrder(api);

        // verify order
        inOrder.verify(api)
               .login();

        inOrder.verify(api)
               .transfer();

        inOrder.verify(api)
               .logout();
    }
}