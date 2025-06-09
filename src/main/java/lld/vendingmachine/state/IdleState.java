package lld.vendingmachine.state;

import lld.vendingmachine.model.Coin;
import lld.vendingmachine.service.VendingMachine;

public class IdleState implements State{
    @Override
    public void insertMoney(VendingMachine vendingMachine, Coin coin) {
        vendingMachine.paymentService.insertCoin(coin);
        vendingMachine.setCurrentState(vendingMachine.hasMoneyState);
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine,String item, int quantity) {
        System.out.println("Insert Coins First !!");
    }

    @Override
    public void refund(VendingMachine vendingMachine) {
        vendingMachine.paymentService.refund();
    }
}
