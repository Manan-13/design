package designpatterns.behavioural.state;

public class MoneyInsertedState implements VendingMachineState{

    VendingMachine machine;

    MoneyInsertedState(VendingMachine machine){
        this.machine = machine;
    }

    @Override
    public void insertCoins() {
        System.out.println("Coin already inserted..");
    }

    @Override
    public void selectProduct() {
        System.out.println("Selected Product..");
        machine.setCurrentState(machine.getDispensingState());
    }

    @Override
    public void dispense() {
        System.out.println("Select Product First to dispense..");
    }
}
