package designpatterns.structural.decorator;

public class CheeseDecorator extends Decorator{

    CheeseDecorator(Pizza basePizza){
        super(basePizza);
    }
    @Override
    public int price() {
        return basePizza.price() + 100;
    }
}
