package paymentSystem;

public class Main {
    public static void main(String[] args) {
        PaymentMethod payment = new UPIPayment();
        PaymentService service =  new PaymentService(payment);
        service.process(1000);
    }
}
