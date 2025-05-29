package designpatterns.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        Remote remoteForTV = new BasicRemote(tv);
        remoteForTV.powerOn();
        remoteForTV.changeChannel(5);
        remoteForTV.powerOff();

        System.out.println();

        Device radio = new Radio();
        Remote remoteForRadio = new BasicRemote(radio);
        remoteForRadio.powerOn();
        remoteForRadio.changeChannel(2);
        remoteForRadio.powerOff();
    }
}
