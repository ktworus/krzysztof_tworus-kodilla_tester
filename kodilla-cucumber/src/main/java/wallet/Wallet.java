package wallet;

public class Wallet {
    private int balance = 0;
    private String message;
    public Wallet() {
    }
        public void deposit(int money){
        this.balance += money;
        }
        public int getBalance () {
            return balance;
        }
        public void debit(int money) {
        if(getBalance()>=money){
            this.balance -= money;
            this.message = "You are not broke yet";

        }else{
            this.message = "Not enough money!!!";
        }
    }
    public String getMessage(){
        return this.message;
    }
    }

