package designpatterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car ford = carFactory.getCar("Ford");
        ford.drive();
    }
}