package designpatterns.structural.decorator;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new MushroomDecorator(new CheeseDecorator(new MargheritaPizza()));
        System.out.println(pizza.price());
    }
}
