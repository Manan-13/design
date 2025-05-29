package designpatterns.behavioural.state;

public class VendingMachine {
    VendingMachineState currentState;
    private VendingMachineState idleState;
    private VendingMachineState moneyInsertedState;
    private VendingMachineState dispensingState;

    VendingMachine(){
        this.idleState = new IdleState(this);
        this.moneyInsertedState = new MoneyInsertedState(this);
        this.dispensingState = new DispensingState(this);
        this.currentState = idleState;
    }

    public void insertCoin() {
        currentState.insertCoins();
    }

    public void selectProduct() {
        currentState.selectProduct();
    }

    public void dispense() {
        currentState.dispense();
    }

    public void setCurrentState(VendingMachineState state) {
        this.currentState = state;
    }

    public VendingMachineState getDispensingState() {
        return dispensingState;
    }

    public VendingMachineState getMoneyInsertedState() {
        return moneyInsertedState;
    }

    public VendingMachineState getIdleState(){
        return idleState;
    }
}
