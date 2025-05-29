package designpatterns.structural.bridge;

public class BasicRemote extends Remote {

    public BasicRemote(Device device) {
        super(device);
    }

    public void powerOn() {
        device.turnOn();
    }

    public void powerOff() {
        device.turnOff();
    }

    public void changeChannel(int channel) {
        device.setChannel(channel);
    }
}
