package designpatterns.structural.facade;

public class DVDPlayer {
    void on() { System.out.println("DVD Player ON"); }
    void play(String movie) { System.out.println("Playing movie: " + movie); }
    void off() { System.out.println("DVD Player OFF"); }

}
