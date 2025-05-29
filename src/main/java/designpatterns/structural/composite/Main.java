package designpatterns.structural.composite;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("Resume.pdf");
        File file2 = new File("CoverLetter.pdf");

        Directory dir = new Directory("Documents", List.of(file1, file2));

        File file3 = new File("Passport.jpg");
        Directory dir2 = new Directory("Pictures", List.of(file3));

        Directory home = new Directory("Home", List.of(dir, dir2));
        home.ls("");
    }
}
