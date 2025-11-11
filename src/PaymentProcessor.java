import java.util.ArrayList;

public class PaymentProcessor {
    private ArrayList<Payment> payments = new ArrayList<>();

    public void addPaymentMethod(Payment payment) {
        payments.add(payment);
    }

    public void processAll(double amount) {
        System.out.println("\n=== Procesare plăți pentru suma: " + amount + " RON ===");
        for (Payment p : payments) {
            p.pay(amount); // Polimorfism în acțiune
        }
    }
}
