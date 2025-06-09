package lld.vendingmachine.model;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private Map<String, Item> itemMap = new HashMap<>();

    public void setItems(Map<String, Item> itemMap) {
        this.itemMap = itemMap;
    }

    public void addItem(Item item) {
        if (itemMap.containsKey(item.getName())) {
            int ogQuantity = itemMap.get(item.getName()).getQuantity();
            item.setQuantity(ogQuantity + item.getQuantity());
            itemMap.put(item.getName(), item);
        } else
            itemMap.put(item.getName(), item);
    }

    public void removeItem(String item, int quantity){
        if(itemMap.containsKey(item)){
            Item availabeItem = itemMap.get(item);
            if(itemMap.get(item).getQuantity() < quantity) System.out.println("Insufficient inventory for item: " + item);
            else availabeItem.setQuantity(availabeItem.getQuantity() - quantity);
        }else System.out.println("Item: " + item + "not in inventory");
    }

    public int getItemQuantity(String item){
        if(itemMap.containsKey(item)) return itemMap.get(item).getQuantity();
        return 0;
    }

    public int getItemCost(String item){
        if(itemMap.containsKey(item)) return itemMap.get(item).getPrice();
        throw new RuntimeException("Item does not exist");
    }
}
