package task4;

public class BankAccount {
    private String owner;
   private double balance;
    BankAccount (String someOwner , double someBalance){
        this.owner = someOwner;
        this.balance = someBalance;
    }
    String getOwner(){
        return this.owner;
    }
    double getBalance(){
        return  balance;
    }
    void setOwner(String newOwner){
        this.owner = newOwner;
    }
    void setBalance(double newBalance){
        this.balance = newBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public void printBalance() {
        System.out.println("Текущий баланс: " + balance);
    }
}

