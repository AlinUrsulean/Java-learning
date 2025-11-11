public class CryptoPayment implements Payment {
    private String walletAddress;

    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Plată de " + amount + " RON prin portofelul crypto: " + walletAddress);
    }
}
