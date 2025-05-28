package designpatterns.structural.proxy;

public class PaymentServiceProxy implements PaymentService{

    PaymentService paymentService;
    public PaymentServiceProxy(PaymentService realService) {
        this.paymentService = realService;
    }

    @Override
    public void makePayment(String account, String money) {
        System.out.println("Starting payment process");  // pre-processing
        paymentService.makePayment(account, money);
        System.out.println("Payment complete"); // post-processing
    }
}
