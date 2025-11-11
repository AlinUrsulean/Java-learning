public class PaypalPayment implements Payment {
    private String email;

    public PaypalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Plată de " + amount + " RON prin PayPal (" + email + ")");
    }
}
