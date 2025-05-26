package designpatterns.behavioural.strategy;

import designpatterns.behavioural.strategy.drivestrategy.FlyingDrivingStrategy;
import designpatterns.behavioural.strategy.drivestrategy.NormalDrivingStrategy;
import designpatterns.behavioural.strategy.vehicle.Car;
import designpatterns.behavioural.strategy.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car(new NormalDrivingStrategy());
        car.drive();
        car = new Car(new FlyingDrivingStrategy()); // or can just add a setter and set the strategy.
        car.drive();
    }
}
