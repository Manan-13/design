package designpatterns.behavioural.memento;

public class EditorMemento {

    private String text;
    private int cursor;

    EditorMemento(String text, int cursor){
        this.text = text;
        this.cursor = cursor;
    }

    public String getText() {
        return text;
    }

    public int getCursor() {
        return cursor;
    }
}
