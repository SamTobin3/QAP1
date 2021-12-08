package com.qap1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AccountTest {
    @Test
    public void accountBalanceTransferTest()
    {
        Account Acc1 = new Account("1", "Daniel", 5000);
        Account Acc2 = new Account("2", "Harris", 4000);

        Acc1.transferTo(Acc2, 1000);

        assertEquals(4000, Acc1.getBalance());
        assertEquals(5000, Acc2.getBalance());
    }
}