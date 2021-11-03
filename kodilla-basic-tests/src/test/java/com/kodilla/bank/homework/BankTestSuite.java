package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldReturnTotalSaldo() {

        Bank bank = new Bank();
        bank.addMachineTransaction(4, 0);
        bank.addMachineTransaction(5,0);
        bank.addMachineTransaction(6,0);
        bank.addMachineTransaction(-2,0);
        bank.addMachineTransaction(-3,0);
        bank.addMachineTransaction(10,1);
        bank.addMachineTransaction(8,1);
        bank.addMachineTransaction(12,1);
        bank.addMachineTransaction(-4,1);
        bank.addMachineTransaction(-6,1);
        bank.addMachineTransaction(0,0);
        bank.addMachineTransaction(0,1);

        assertEquals(30,bank.getTotalSum());
        System.out.println(bank.getTotalSum());

    }
    @Test
    public void shouldReturnNumberofPayOuts() {

        Bank bank = new Bank();
        bank.addMachineTransaction(4, 0);
        bank.addMachineTransaction(5,0);
        bank.addMachineTransaction(6,0);
        bank.addMachineTransaction(-2,0);
        bank.addMachineTransaction(-3,0);
        bank.addMachineTransaction(10,1);
        bank.addMachineTransaction(8,1);
        bank.addMachineTransaction(12,1);
        bank.addMachineTransaction(-4,1);
        bank.addMachineTransaction(-6,1);
        bank.addMachineTransaction(0,0);
        bank.addMachineTransaction(0,1);

        assertEquals(4,bank.getTotalNumberPayOuts());
    }
    @Test
    public void shouldReturnNumberofPayIns() {

        Bank bank = new Bank();
        bank.addMachineTransaction(4, 0);
        bank.addMachineTransaction(5,0);
        bank.addMachineTransaction(6,0);
        bank.addMachineTransaction(-2,0);
        bank.addMachineTransaction(-3,0);
        bank.addMachineTransaction(10,1);
        bank.addMachineTransaction(8,1);
        bank.addMachineTransaction(12,1);
        bank.addMachineTransaction(-4,1);
        bank.addMachineTransaction(-6,1);
        bank.addMachineTransaction(0,0);
        bank.addMachineTransaction(0,1);

        assertEquals(6,bank.getTotalNumberPayIns());
        System.out.println(bank.getTotalNumberPayIns());
    }
    @Test
    public void shouldReturnAveragePayIn() {

        Bank bank = new Bank();
        bank.addMachineTransaction(4, 0);
        bank.addMachineTransaction(5,0);
        bank.addMachineTransaction(6,0);
        bank.addMachineTransaction(-2,0);
        bank.addMachineTransaction(-3,0);
        bank.addMachineTransaction(10,1);
        bank.addMachineTransaction(8,1);
        bank.addMachineTransaction(12,1);
        bank.addMachineTransaction(-4,1);
        bank.addMachineTransaction(-6,1);
        bank.addMachineTransaction(0,0);
        bank.addMachineTransaction(0,1);

        assertEquals(8,bank.getAveragePayIn(),1);
        System.out.println("Expected 8 "+ bank.getAveragePayIn());
    }
    @Test
    public void shouldReturnAveragePayOut() {

        Bank bank = new Bank();
        bank.addMachineTransaction(4, 0);
        bank.addMachineTransaction(5,0);
        bank.addMachineTransaction(6,0);
        bank.addMachineTransaction(-2,0);
        bank.addMachineTransaction(-3,0);
        bank.addMachineTransaction(10,1);
        bank.addMachineTransaction(8,1);
        bank.addMachineTransaction(12,1);
        bank.addMachineTransaction(-4,1);
        bank.addMachineTransaction(-6,1);
        bank.addMachineTransaction(0,0);
        bank.addMachineTransaction(0,1);

        assertEquals(-4,bank.getAveragePayOut(),0.5);

    }
}