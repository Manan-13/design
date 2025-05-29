package designpatterns.behavioural.state;

public class DispensingState implements VendingMachineState{

    VendingMachine machine;

    DispensingState(VendingMachine machine){
        this.machine = machine;
    }

    @Override
    public void insertCoins() {
        System.out.println("Money is inserted and product selected. Need to dispense first..");
    }

    @Override
    public void selectProduct() {
        System.out.println("Product already selected..");
    }

    @Override
    public void dispense() {
        System.out.println("Product dispensing..");
        machine.setCurrentState(machine.getIdleState());
    }
}
