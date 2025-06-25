import java.util.Scanner;

interface PaymentGateway {
    void processPayment(double amount);
}

class CreditCardPayment implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of Rs." + amount);
    }
}

class UPIPayment implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of Rs." + amount);
    }
}

public class PaymentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentGateway payment;

        System.out.println("Enter payment method (credit/upi): ");
        String method = sc.nextLine();

        System.out.print("Enter amount to pay: Rs.");
        double amount = sc.nextDouble();

        if (method.equalsIgnoreCase("credit")) {
            payment = new CreditCardPayment();
        } else if (method.equalsIgnoreCase("upi")) {
            payment = new UPIPayment();
        } else {
            System.out.println("Invalid payment method.");
            sc.close();
            return;
        }

        payment.processPayment(amount);
        sc.close();
    }
}
