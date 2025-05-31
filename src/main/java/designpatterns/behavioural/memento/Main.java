package designpatterns.behavioural.memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        EditorHistory history = new EditorHistory();

        editor.write("Hello");
        history.save(editor);  // Save checkpoint

        editor.write(" World");
        editor.print();  // Text: Hello World | Cursor at: 11

        history.undo(editor);
        editor.print();  // Text: Hello | Cursor at: 5
    }
}
