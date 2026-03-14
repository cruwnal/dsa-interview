package paymentSystem;

public class PaymentService {
    private PaymentMethod paymentMethod;
    public PaymentService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public void process(double amount) {
        paymentMethod.pay(amount);
    }
}
