package paymentSystem;

public class WalletPay implements PaymentMethod, Refundable{
    @Override
    public void pay(double amount) {
        System.out.println("wallet pay");
    }

    @Override
    public void refund(double amount) {
        System.out.println("wallet refund");
    }
}
