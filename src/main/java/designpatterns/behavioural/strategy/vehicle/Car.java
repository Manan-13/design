package designpatterns.behavioural.strategy.vehicle;

import designpatterns.behavioural.strategy.drivestrategy.DriveStrategy;

public class Car extends Vehicle {

    public Car(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
