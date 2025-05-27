package designpatterns.creational.factory;

public class CarFactory {

    public Car getCar(String name){
        return switch (name) {
            case "Ford" -> new Ford();
            case "Ferrari" -> new Ferrari();
            default -> throw new IllegalArgumentException();
        };
    }
}
