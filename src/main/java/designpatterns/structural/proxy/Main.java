package designpatterns.structural.proxy;

public class Main {
    public static void main(String[] args) {

        PaymentService service = new PaymentServiceImpl();

        // Wrap the real service with proxy
        PaymentService proxy = new PaymentServiceProxy(service);

        // Call method
        proxy.makePayment("Manan's account", "323");
    }
}
