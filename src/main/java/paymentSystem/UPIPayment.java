package paymentSystem;

public class UPIPayment implements PaymentMethod,Refundable{
    @Override
    public void pay(double amount) {
        System.out.println("upi payment");
    }

    @Override
    public void refund(double amount) {
        System.out.println("upi refund");
    }
}
