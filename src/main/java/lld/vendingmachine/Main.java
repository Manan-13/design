package lld.vendingmachine;

import lld.vendingmachine.model.Coin;
import lld.vendingmachine.model.Item;
import lld.vendingmachine.service.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.restockItem(new Item("Lays", 5, 25));
        vendingMachine.restockItem(new Item("MaxProtienBar", 5, 40));

        vendingMachine.insertCoins(Coin.FIFTY);
        vendingMachine.selectProduct("Lays", 1);
        vendingMachine.refundOrChange();
    }
}
