package designpatterns.behavioural.state;

public class IdleState implements VendingMachineState{

    VendingMachine machine;

    IdleState(VendingMachine machine){
        this.machine = machine;
    }

    @Override
    public void insertCoins() {
        System.out.println("Coins Inserted..");
        machine.setCurrentState(machine.getMoneyInsertedState());
    }

    @Override
    public void selectProduct() {
        System.out.println("Insert Money first..");
    }

    @Override
    public void dispense() {
        System.out.println("Insert Money and then select product to dispense..");
    }
}
