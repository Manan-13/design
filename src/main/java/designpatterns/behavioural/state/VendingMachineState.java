package designpatterns.behavioural.state;

public interface VendingMachineState {

    void insertCoins();
    void selectProduct();
    void dispense();
}
