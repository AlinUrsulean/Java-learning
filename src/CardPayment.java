public class CardPayment  implements Payment {
    private String cardNumber;

    public CardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Plată de " + amount + " RON cu cardul " + maskCardNumber());
    }

    private String maskCardNumber() {
        if (cardNumber.length() > 4)
            return "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
        else
            return cardNumber;
    }
}
