package designpatterns.behavioural.memento;
// Originator
public class Editor {

    private String text = "";
    private int cursor;

    EditorMemento save(){
        return new EditorMemento(text, cursor);
    }

    void write(String string){
        text += string;
        cursor += string.length();
    }

    public void print() {
        System.out.println("Text: " + text + " | Cursor at: " + cursor);
    }

    public void restore(EditorMemento memento) {
        this.text = memento.getText();
        this.cursor = memento.getCursor();
    }
}
