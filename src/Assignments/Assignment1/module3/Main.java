package Assignments.Assignment1.module3;

    import java.util.Scanner;

    class BankAccount {

        // Private variables (Encapsulation)
        private String accountNumber;
        private double balance;

        // Constructor
        BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        // Getter method
        public double getBalance() {
            return balance;
        }

        // Deposit method
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Amount Deposited: " + amount);
                System.out.println("Updated Balance: " + balance);
            } else {
                System.out.println("Invalid Deposit Amount");
            }
        }

        // Withdraw method
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Amount Withdrawn: " + amount);
                System.out.println("Remaining Balance: " + balance);
            } else {
                System.out.println("Insufficient Balance or Invalid Amount");
            }
        }
    }

    public class Main {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            BankAccount account = new BankAccount("12345", 1000);

            account.deposit(500);
            account.withdraw(300);

            System.out.println("Final Balance: " + account.getBalance());
        }
    }

