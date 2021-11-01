package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldReturnTotalSaldo() {

        Bank bank = new Bank();
        bank.addMachine1Transaction(4);
        bank.addMachine1Transaction(5);
        bank.addMachine1Transaction(6);
        bank.addMachine1Transaction(-2);
        bank.addMachine1Transaction(-3);
        bank.addMachine2Transaction(10);
        bank.addMachine2Transaction(8);
        bank.addMachine2Transaction(12);
        bank.addMachine2Transaction(-4);
        bank.addMachine2Transaction(-6);
        bank.addMachine1Transaction(0);
        bank.addMachine2Transaction(0);

        assertEquals(30,bank.getTotalSum());
        System.out.println(bank.getTotalSum());

    }
    @Test
    public void shouldReturnNumberofPayOuts() {

        Bank bank = new Bank();
        bank.addMachine1Transaction(4);
        bank.addMachine1Transaction(5);
        bank.addMachine1Transaction(6);
        bank.addMachine1Transaction(-2);
        bank.addMachine1Transaction(-3);
        bank.addMachine2Transaction(10);
        bank.addMachine2Transaction(8);
        bank.addMachine2Transaction(12);
        bank.addMachine2Transaction(-4);
        bank.addMachine2Transaction(-6);
        bank.addMachine1Transaction(0);
        bank.addMachine2Transaction(0);

        assertEquals(4,bank.getTotalNumberPayOuts());
    }
    @Test
    public void shouldReturnNumberofPayIns() {

        Bank bank = new Bank();
        bank.addMachine1Transaction(4);
        bank.addMachine1Transaction(5);
        bank.addMachine1Transaction(6);
        bank.addMachine1Transaction(-2);
        bank.addMachine1Transaction(-3);
        bank.addMachine2Transaction(10);
        bank.addMachine2Transaction(8);
        bank.addMachine2Transaction(12);
        bank.addMachine2Transaction(-4);
        bank.addMachine2Transaction(-6);
        bank.addMachine1Transaction(0);
        bank.addMachine2Transaction(0);

        assertEquals(6,bank.getTotalNumberPayIns());
        System.out.println(bank.getTotalNumberPayIns());
    }
    @Test
    public void shouldReturnAveragePayIn() {

        Bank bank = new Bank();
        bank.addMachine1Transaction(4);
        bank.addMachine1Transaction(5);
        bank.addMachine1Transaction(6);
        bank.addMachine1Transaction(-2);
        bank.addMachine1Transaction(-3);
        bank.addMachine2Transaction(10);
        bank.addMachine2Transaction(8);
        bank.addMachine2Transaction(12);
        bank.addMachine2Transaction(-4);
        bank.addMachine2Transaction(-6);
        bank.addMachine1Transaction(0);
        bank.addMachine2Transaction(0);

        assertEquals(8,bank.getAveragePayIn(),1);
        System.out.println("Expected 8 "+ bank.getAveragePayIn());
    }
    @Test
    public void shouldReturnAveragePayOut() {

        Bank bank = new Bank();
        bank.addMachine1Transaction(4);
        bank.addMachine1Transaction(5);
        bank.addMachine1Transaction(6);
        bank.addMachine1Transaction(-2);
        bank.addMachine1Transaction(-3);
        bank.addMachine2Transaction(10);
        bank.addMachine2Transaction(8);
        bank.addMachine2Transaction(12);
        bank.addMachine2Transaction(-4);
        bank.addMachine2Transaction(-6);
        bank.addMachine1Transaction(0);
        bank.addMachine2Transaction(0);

        assertEquals(-4,bank.getAveragePayOut(),0.5);

    }
}