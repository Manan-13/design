package designpatterns.structural.decorator;

public abstract class Decorator implements Pizza{

    Pizza basePizza;

    Decorator(Pizza basePizza){
        this.basePizza = basePizza;
    }
}
