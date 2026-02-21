package Day3Oopsbasics;

public class BankAccount {
    String accountholder;
    double balance;

    public BankAccount(String Aholder, double Bbalance) {
        accountholder = Aholder;
        balance = Bbalance;
    }

    void deposit(double amount) {
        amount = 20000;
        balance = balance + amount;
        System.out.println("updated Amount");
    }

    void withdraw(double amount) {
        if (amount < balance) {
            balance -= amount;
            System.out.println("amount deducted");
        } else {
            System.out.println("insufficient balance");
        }
    }

    void displaybalance() {
        System.out.println("accountholder name" + accountholder);
        System.out.println("current balance" + balance);
    }
}
    class Bank {
        public static void main(String[] args) {


            BankAccount b1 = new BankAccount("sushmita", 100000);
            b1.deposit(488);
            b1.withdraw(6767);
            b1.displaybalance();
        }
    }
