package lld.vendingmachine.service;

import lld.vendingmachine.model.Coin;

public class PaymentService {
    private int insertedAmount;

    public void insertCoin(Coin coin){
        System.out.println("Inserting coins worth: " + coin.getValue());
        insertedAmount += coin.getValue();
    }

    public void deduct(int price) {
        insertedAmount -= price;
    }

    public void refund() {
        System.out.println("Refunding left amount: "+ insertedAmount);
        insertedAmount = 0;
    }

    public int fetchBalance(){
        return insertedAmount;
    }
}
