
package com.kodilla.bank.homework;
public class Bank {
    Bank bank;
    private CashMachine machine1;
    private CashMachine machine2;
    CashMachine[] machines = new CashMachine[]{machine1,machine2};

    public Bank(){
        this.bank = bank;

        this.machine1 = new CashMachine();
        this.machine2 = new CashMachine();

    }
    public void addMachine1Transaction(int transaction) {
        this.machine1.add(transaction);
    }
    public void addMachine2Transaction(int transaction) {
        this.machine2.add(transaction);
    }
    public int getTotalSum() {
        int totalSum = machine1.getSaldo()+machine2.getSaldo();
        return totalSum;
    }
    public double getTotalNumberPayOuts(){
        double number = machine1.getNumberOfPayOuts()+machine2.getNumberOfPayOuts();
        return number;
    }
    public double getTotalNumberPayIns(){
        double number = machine1.getNumberOfPayIns()+machine2.getNumberOfPayIns();
        return number;
    }
    public double getAveragePayIn(){
        double number = (machine1.getSaldoPositive()+machine2.getSaldoPositive())/getTotalNumberPayIns();
        return number;
    }
    public double getAveragePayOut(){
        double number = (machine1.getSaldoNegative()+machine2.getSaldoNegative())/getTotalNumberPayOuts();
        return number;
    }
}





