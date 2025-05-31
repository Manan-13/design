package designpatterns.behavioural.visitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DocumentElement> document = List.of(
                new TextElement("Hello, Manan!"),
                new ImageElement("img/logo.png")
        );

        DocumentVisitor renderer = new RenderingVisitor();

        for (DocumentElement element : document) {
            element.accept(renderer);
        }
    }
}
