package designpatterns.behavioural.state;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.selectProduct();      // Insert coin first.
        machine.insertCoin();         // Coin inserted.
        machine.insertCoin();         // Coin already inserted.
        machine.selectProduct();      // Product selected.
        machine.dispense();           // Dispensing...
        machine.dispense();           // Payment required first.
    }
}
