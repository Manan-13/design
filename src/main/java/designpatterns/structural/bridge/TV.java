package designpatterns.structural.bridge;

public class TV implements Device {
    public void turnOn() {
        System.out.println("TV is ON");
    }

    public void turnOff() {
        System.out.println("TV is OFF");
    }

    public void setChannel(int channel) {
        System.out.println("TV channel set to " + channel);
    }
}