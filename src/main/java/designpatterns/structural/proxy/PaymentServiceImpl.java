package designpatterns.structural.proxy;

public class PaymentServiceImpl implements PaymentService{
    @Override
    public void makePayment(String account, String money) {
        System.out.println("Transferring " + money + "$ to " + account);
    }
}
