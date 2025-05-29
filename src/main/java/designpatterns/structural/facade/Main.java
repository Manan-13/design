package designpatterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem sound = new SoundSystem();
        Lights lights = new Lights();

        HomeTheatreFacade theater = new HomeTheatreFacade(dvd, projector, sound, lights);

        theater.watchMovie("Inception");
        System.out.println("\n--- Movie Over ---\n");
        theater.endMovie();
    }
}
