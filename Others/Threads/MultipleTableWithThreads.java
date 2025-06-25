package Others.Threads;
import java.util.Scanner;

class TablePrinter extends Thread {
    private int table;

    TablePrinter(int table) {
        this.table = table;
    }

    public void run() {
        System.out.println("\n" + table + " Table:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + table + " = " + (table * i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class MultipleTableWithThreads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'y';

        do {
            try {
                System.out.print("Do you want to print Table (yes/no): ");
                ch = sc.nextLine().trim().toLowerCase().charAt(0);

                if (ch == 'n') {
                    System.out.println("Thank you!");
                    break;
                } else if (ch == 'y') {
                    System.out.print("Enter the table you want: ");
                    int table = sc.nextInt();
                    sc.nextLine();
                    TablePrinter t1 = new TablePrinter(table);
                    t1.start();
                    t1.join();
                } else {
                    System.out.println("Invalid input. Please type yes or no.");
                }
            } catch (Exception e) {
                System.out.println("Input Error. Please enter valid number.");
                sc.nextLine();
            }
        } while (ch != 'n');

        sc.close();
    }
}
