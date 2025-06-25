import java.util.Scanner;
interface Depositable {
    default double deposit(double amount) { return 0; }
}

interface Withdrawable {
    default double withdraw(double amount) { return 0; }
}

class BankAccount implements Depositable, Withdrawable {
    private double balance;

    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return balance;
        }
        return -1;
    }

    public double withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return balance;
        }
        return -1;
    }

    public double checkBalance() {
        return balance;
    }

    double getBalance() {
        return balance;
    }
}

public class BankTransactions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;
        int choice;
        BankAccount b = new BankAccount();

        do {
            System.out.println("\n\tBANK");
            System.out.println("------------------");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance");
            System.out.println("4. Exit");
            System.out.println("------------------");
            System.out.print("Do You Want to Visit Bank? (yes/no): ");
            answer = sc.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                System.out.print("Enter Your Choice: ");
                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter Amount to Deposit: Rs.");
                        double amount = sc.nextDouble();
                        sc.nextLine();
                        if (b.deposit(amount) != -1) {
                            System.out.println("Money of Rs." + amount + " Deposited");
                        } else {
                            System.out.println("Invalid Amount");
                        }
                    }
                    case 2 -> {
                        System.out.print("Enter Amount to Withdraw: Rs.");
                        double amount = sc.nextDouble();
                        sc.nextLine();
                        if (b.withdraw(amount) != -1) {
                            System.out.println("Money of Rs." + amount + " Withdrawn");
                        } else {
                            System.out.println("Insufficient Balance or Invalid Amount");
                        }
                    }
                    case 3 -> System.out.println("Account Balance: Rs." + b.checkBalance());
                    case 4 -> System.out.println("Thank You!");
                    default -> System.out.println("Invalid Input");
                }
            } else if (!answer.equalsIgnoreCase("no")) {
                System.out.println("Invalid Input. Type 'yes' or 'no'");
            }

        } while (!answer.equalsIgnoreCase("no"));

        sc.close();
    }
}
