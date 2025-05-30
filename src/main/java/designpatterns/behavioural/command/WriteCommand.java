package designpatterns.behavioural.command;

///  Concrete command
public class WriteCommand implements Command {
    private TextDocument document;
    private String text;

    public WriteCommand(TextDocument document, String text) {
        this.document = document;
        this.text = text;
    }

    public void execute() {
        document.write(text);
    }

    public void undo() {
        document.delete(text.length());
    }
}