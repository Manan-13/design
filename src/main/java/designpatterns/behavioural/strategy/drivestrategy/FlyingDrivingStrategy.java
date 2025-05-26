package designpatterns.behavioural.strategy.drivestrategy;

public class FlyingDrivingStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Flying in the air.......");
    }
}
