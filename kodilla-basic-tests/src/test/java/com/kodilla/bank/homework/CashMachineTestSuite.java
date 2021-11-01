package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(2);
        cashMachine.add(8);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(2, transactions.length);
        assertEquals(2, transactions[0]);
        assertEquals(8, transactions[1]);

    }
    @Test
    public void shouldCalculateSum() {
        CashMachine machine1 = new CashMachine();
        CashMachine machine2 = new CashMachine();

        machine1.add(4);
        machine1.add(4);
        machine1.add(5);
        machine1.add(-2);
        machine1.add(-1);
        machine2.add(2);
        machine2.add(4);
        machine2.add(-6);
        machine2.add(30);
        machine2.add(-10);

        assertEquals(10, machine1.getSaldo());
        assertEquals(20,machine2.getSaldo());

        System.out.println(machine1.getSaldo());
        System.out.println(machine2.getSaldo());
    }
    @Test
    public void shouldReturnNumberOfTransactions(){
        CashMachine machine1 = new CashMachine();
        CashMachine machine2 = new CashMachine();
        machine1.add(4);
        machine1.add(4);
        machine1.add(5);
        machine1.add(-2);
        machine1.add(-1);
        machine1.add(0);

        machine2.add(2);
        machine2.add(4);
        machine2.add(-6);
        machine2.add(30);
        machine2.add(-10);
        machine2.add(0);

        assertEquals(6, machine1.getNumberOfTrans());
        assertEquals(6,machine2.getNumberOfTrans());
    }
    @Test
    public void shouldReturnNumberOfPayOuts(){
        CashMachine machine1 = new CashMachine();
        CashMachine machine2 = new CashMachine();
        machine1.add(4);
        machine1.add(4);
        machine1.add(5);
        machine1.add(-2);
        machine1.add(-1);
        machine2.add(2);
        machine2.add(4);
        machine2.add(-6);
        machine2.add(30);
        machine2.add(-10);

        assertEquals(2, machine1.getNumberOfPayOuts());
        assertEquals(2,machine2.getNumberOfPayOuts());
    }
    @Test
    public void shouldReturnNumberOfPayIns(){
        CashMachine machine1 = new CashMachine();
        CashMachine machine2 = new CashMachine();
        machine1.add(4);
        machine1.add(4);
        machine1.add(5);
        machine1.add(-2);
        machine1.add(-1);
        machine2.add(2);
        machine2.add(4);
        machine2.add(-6);
        machine2.add(30);
        machine2.add(-10);

        assertEquals(3, machine1.getNumberOfPayIns());
        assertEquals(3,machine2.getNumberOfPayIns());
    }
    @Test
    public void shouldReturnSaldoOfPayIns(){
        CashMachine machine1 = new CashMachine();
        CashMachine machine2 = new CashMachine();
        machine1.add(4);
        machine1.add(4);
        machine1.add(5);
        machine1.add(-2);
        machine1.add(-1);

        machine2.add(2);
        machine2.add(4);
        machine2.add(-6);
        machine2.add(30);
        machine2.add(-10);

        assertEquals(13, machine1.getSaldoPositive());
        assertEquals(36, machine2.getSaldoPositive());
    }
    @Test
    public void shouldReturnSaldoOfPayOuts(){
        CashMachine machine1 = new CashMachine();
        CashMachine machine2 = new CashMachine();
        machine1.add(4);
        machine1.add(4);
        machine1.add(5);
        machine1.add(-2);
        machine1.add(-1);
        machine1.add(0);

        machine2.add(2);
        machine2.add(4);
        machine2.add(-6);
        machine2.add(30);
        machine2.add(-10);
        machine1.add(0);

        assertEquals(-3, machine1.getSaldoNegative());
        assertEquals(-16, machine2.getSaldoNegative());
    }

}

