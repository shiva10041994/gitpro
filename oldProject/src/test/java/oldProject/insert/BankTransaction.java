package oldProject.insert;
import java.util.Scanner;

public class BankTransaction {

    private static double balance = 0.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bank Transaction System!");
        System.out.println("--------------------------------------");

        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1/2/3/4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;

                case 3:
                    checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using the Bank Transaction System!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void deposit(double amount) {
        balance += 500;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    private static void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance. Unable to withdraw.");
        }
    }

    private static void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }
}

