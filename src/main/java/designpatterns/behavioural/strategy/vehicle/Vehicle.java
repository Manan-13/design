package designpatterns.behavioural.strategy.vehicle;

import designpatterns.behavioural.strategy.drivestrategy.DriveStrategy;

public class Vehicle {
    private DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
