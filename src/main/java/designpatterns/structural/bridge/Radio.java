package designpatterns.structural.bridge;

public class Radio implements Device {
    public void turnOn() {
        System.out.println("Radio is ON");
    }

    public void turnOff() {
        System.out.println("Radio is OFF");
    }

    public void setChannel(int channel) {
        System.out.println("Radio channel set to " + channel);
    }
}