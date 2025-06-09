package lld.vendingmachine.state;

import lld.vendingmachine.model.Coin;
import lld.vendingmachine.service.VendingMachine;

public class HasMoneyState implements State{
    @Override
    public void insertMoney(VendingMachine vendingMachine, Coin coin) {
        vendingMachine.paymentService.insertCoin(coin);
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, String item, int quantity) {
        if(vendingMachine.getInventoryForItem(item) >= quantity){
            if(vendingMachine.inventory.getItemCost(item) * quantity <= vendingMachine.paymentService.fetchBalance()){
                vendingMachine.setCurrentState(vendingMachine.dispensingState);
                System.out.println("Dispensing item(s)");
                vendingMachine.paymentService.deduct(vendingMachine.inventory.getItemCost(item) * quantity);
                vendingMachine.inventory.removeItem(item, quantity);
                if(vendingMachine.paymentService.fetchBalance() > 0) vendingMachine.setCurrentState(vendingMachine.hasMoneyState);
                else
                    vendingMachine.setCurrentState(vendingMachine.idleState);
            } else {
                System.out.println("Not Enough Balance");
            }
        } else System.out.println("Not Enough Stock");
    }

    @Override
    public void refund(VendingMachine vendingMachine) {
        vendingMachine.paymentService.refund();
        vendingMachine.setCurrentState(vendingMachine.idleState);
    }
}
