package lld.vendingmachine.service;

import lld.vendingmachine.model.Coin;
import lld.vendingmachine.model.Inventory;
import lld.vendingmachine.model.Item;
import lld.vendingmachine.state.DispensingState;
import lld.vendingmachine.state.HasMoneyState;
import lld.vendingmachine.state.IdleState;
import lld.vendingmachine.state.State;

public class VendingMachine {

    public IdleState idleState;
    public HasMoneyState hasMoneyState;
    public DispensingState dispensingState;
    private State currentState;
    public Inventory inventory;
    public PaymentService paymentService;

    public VendingMachine() {
        idleState = new IdleState();
        hasMoneyState = new HasMoneyState();
        dispensingState = new DispensingState();
        this.currentState = idleState;
        this.inventory = new Inventory();
        this.paymentService = new PaymentService();
    }

    public void insertCoins(Coin coin){
        this.currentState.insertMoney(this, coin);
    }

    public void selectProduct(String item, int quantity){
        this.currentState.selectProduct(this, item, quantity);
    }

    public void refundOrChange(){
        this.currentState.refund(this);
    }

    public void restockItem(Item item){
        this.inventory.addItem(item);
    }

    public void setCurrentState(State state){
        currentState = state;
    }

    public int getInventoryForItem(String item){
        return inventory.getItemQuantity(item);
    }
}
