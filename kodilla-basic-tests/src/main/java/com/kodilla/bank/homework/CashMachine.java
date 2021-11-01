package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int size;


    public CashMachine() {
        this.size = 0;
        this.transactions = new int[0];
    }
        public void add (int transaction){
            this.size++;
            int[] newTab = new int[this.size];
            System.arraycopy(transactions, 0, newTab, 0, transactions.length);
            newTab[this.size - 1] = transaction;
            this.transactions = newTab;
        }
        public int[] getTransactions () {
            return transactions;
        }

        public int getSaldo () {
            int sum = 0;
            for (int i = 0; i < this.transactions.length; i++) {
                sum += this.transactions[i];
            }
            return sum;
        }
        public int getNumberOfTrans(){
        int number = this.transactions.length;
        return number;

        }
        public int getNumberOfPayOuts(){
        int number = 0;
        for(int i=0; i<getNumberOfTrans(); i++){
            if(this.transactions[i]<0)
            number++;
        }
        return number;
        }
        public int getNumberOfPayIns(){
        int number = 0;
        for(int i=0; i<getNumberOfTrans(); i++){
            if(this.transactions[i]>0)
                number++;
        }
        return number;
    }

    public int getSaldoPositive () {
        int sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if(this.transactions[i]>0)
            sum += this.transactions[i];
        }
        return sum;
    }
    public int getSaldoNegative () {
        int sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if(this.transactions[i]<0)
                sum += this.transactions[i];
        }
        return sum;
    }

    }
