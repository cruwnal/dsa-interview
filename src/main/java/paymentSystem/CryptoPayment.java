package paymentSystem;

public class CryptoPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("crypto payment");
    }
}
