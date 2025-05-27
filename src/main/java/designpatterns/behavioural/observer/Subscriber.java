package designpatterns.behavioural.observer;

public class Subscriber implements Observer {

    public String name;
    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name +" received notification: " + message);
    }
}
