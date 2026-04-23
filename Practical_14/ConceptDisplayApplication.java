import java.util.Scanner;

// Interface
interface BankOperations {
    void withdraw(double amount) throws NotEnoughBalanceException;
    void deposit(double amount);
}

// User-defined Exception
class NotEnoughBalanceException extends Exception {
    public NotEnoughBalanceException(String message) {
        super(message);
    }
}

// Abstract Class
abstract class Account implements BankOperations {
    public double balance;

    public Account(double amount) {
        balance = amount;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public abstract void accountType();
}

// Concrete Class
class SavingsAccount extends Account {

    public SavingsAccount(double amount) {
        super(amount);
    }

    public void withdraw(double amount) throws NotEnoughBalanceException {
        if (amount > balance) {
            throw new NotEnoughBalanceException("Insufficient Balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public void accountType() {
        System.out.println("Savings Account");
    }
}

// Main Class
public class ConceptDisplayApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount acc = new SavingsAccount(1000);

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Type");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wd = sc.nextDouble();
                    try {
                        acc.withdraw(wd);
                    } catch (NotEnoughBalanceException e) {
                        System.out.println("Exception: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Current Balance: " + acc.balance);
                    break;

                case 4:
                    acc.accountType();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}