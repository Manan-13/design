package lld.vendingmachine.state;

import lld.vendingmachine.model.Coin;
import lld.vendingmachine.service.VendingMachine;

public interface State {

    void insertMoney(VendingMachine vendingMachine, Coin coin);
    void selectProduct(VendingMachine vendingMachine, String item, int quantity);
    void refund(VendingMachine vendingMachine);
}
