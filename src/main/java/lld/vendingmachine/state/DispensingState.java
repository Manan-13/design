package lld.vendingmachine.state;

import lld.vendingmachine.model.Coin;
import lld.vendingmachine.service.VendingMachine;

public class DispensingState implements State{
    @Override
    public void insertMoney(VendingMachine vendingMachine, Coin coin) {
        System.out.println("Wait, dispensing in progress.");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, String item, int quantity) {
        System.out.println("Already dispensing. Try after it's done.");

    }

    @Override
    public void refund(VendingMachine vendingMachine) {
        System.out.println("Cannot refund while dispensing.");
    }
}
