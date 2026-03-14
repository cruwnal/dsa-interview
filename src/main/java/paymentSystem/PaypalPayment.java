package paymentSystem;

public class PaypalPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("paypal payment");
    }
}
