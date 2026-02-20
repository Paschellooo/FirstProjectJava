package task4;

public class FourthMain {
    public static void main (String[] args){
BankAccount account = new BankAccount("Smirnov" , 3000);

        account.deposit(500.0);
        account.printBalance();

        account.withdraw(200.0);

        account.printBalance();
    }
}
