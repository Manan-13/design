package designpatterns.behavioural.memento;

import java.util.Stack;

// Caretaker
public class EditorHistory {
    Stack<EditorMemento> history = new Stack<>();

    void save(Editor editor){
        history.push(editor.save());
    }

    void undo(Editor editor){
        if(!history.isEmpty()){
            editor.restore(history.pop());
        }
    }
}
