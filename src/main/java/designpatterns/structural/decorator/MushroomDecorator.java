package designpatterns.structural.decorator;

public class MushroomDecorator extends Decorator {

    MushroomDecorator(Pizza basePizza){
        super(basePizza);
    }

    @Override
    public int price() {
        return basePizza.price() + 100;
    }
}
