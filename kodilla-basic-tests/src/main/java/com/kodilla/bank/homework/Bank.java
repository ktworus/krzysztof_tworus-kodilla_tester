

package com.kodilla.bank.homework;
public class Bank {

    private CashMachine machine1 = new CashMachine();
    private CashMachine machine2 = new CashMachine();
    private CashMachine[] machines = {machine1, machine2};

    public void addMachine1Transaction(int transaction) {
        this.machines[0].add(transaction);
    }
    public void addMachine2Transaction(int transaction) {
        this.machines[1].add(transaction);
    }
    public int getTotalSum() {
        int totalSum = 0;
        for(int i = 0; i< machines.length; i++){
        totalSum += machines[i].getSaldo();
        }
        return totalSum;
    }
    public double getTotalNumberPayOuts(){
        double number = 0;
        for(int i = 0; i< machines.length; i++){
            number += machines[i].getNumberOfPayOuts();
        }
        return number;
    }
    public double getTotalNumberPayIns(){
        double number = 0;
        for(int i = 0; i< machines.length; i++){
            number += machines[i].getNumberOfPayIns();
        }
        return number;
    }
    public double getAveragePayIn(){
        double number = 0;
        for(int i = 0; i< machines.length; i++){
            number += machines[i].getSaldoPositive();
        }
        return number/getTotalNumberPayIns();
    }
    public double getAveragePayOut(){
        double number = 0;
        for(int i = 0; i< machines.length; i++){
            number += machines[i].getSaldoNegative();
        }
        return number/getTotalNumberPayOuts();
    }
}





