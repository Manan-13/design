package designpatterns.behavioural.strategy.drivestrategy;

public class NormalDrivingStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal Driving");
    }
}
