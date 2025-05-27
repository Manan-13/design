package designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Observable {

    String name;
    List<Observer> subscribers;

    YoutubeChannel(String name, List<Observer> subscribers) {
        this.name = name;
        this.subscribers = new ArrayList<>(subscribers);
    }

    @Override
    public void uploadNewVideo() {
        notifyObservers();
    }

    @Override
    public Object getData() {
        return name;
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver() {

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.update("New video Uploaded for channel " + name);
        }
    }

}
