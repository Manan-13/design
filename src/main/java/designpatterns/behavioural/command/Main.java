package designpatterns.behavioural.command;

import org.w3c.dom.Text;

public class Main {
    public static void main(String[] args) {
        TextDocument doc = new TextDocument();
        CommandManager manager = new CommandManager();

        manager.executeCommand(new WriteCommand(doc, "Hello "));
        manager.executeCommand(new WriteCommand(doc, "World"));

        System.out.println("Text: " + doc.getContent());  // Hello World

        manager.undo();
        System.out.println("After undo: " + doc.getContent());  // Hello

        manager.redo();
        System.out.println("After redo: " + doc.getContent());  // Hello World
    }
}
