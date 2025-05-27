package designpatterns.behavioural.observer;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Observer o1 = new Subscriber("Manan");
        Observer o2 = new Subscriber("Guy");
        Observable channel = new YoutubeChannel("FCB", List.of(o2));
        channel.addObserver(o1);
        channel.uploadNewVideo();
    }
}
