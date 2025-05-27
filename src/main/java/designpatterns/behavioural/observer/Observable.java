package designpatterns.behavioural.observer;

public interface Observable {
    void uploadNewVideo();
    Object getData();
    void addObserver(Observer observer);
    void removeObserver();
    void notifyObservers();
}
