import java.util.Scanner;

// Custom Exception for insufficient balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Bank Account Class
class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive!");
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive!");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    // Display balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Main Class
public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1000); // initial balance

        try {
            while (true) {
                System.out.println("\n--- Banking Menu ---");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Choose option: ");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = sc.nextDouble();
                        account.deposit(depositAmount);
                        break;

                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = sc.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;

                    case 3:
                        account.displayBalance();
                        break;

                    case 4:
                        System.out.println("Thank you for using banking system!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            }
        }

        // Handle invalid numeric input
        catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input! Please enter numeric values.");
        }

        // Handle illegal arguments (negative values)
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Handle insufficient balance
        catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        finally {
            System.out.println("Program terminated.");
        }
    }
}
