package designpatterns.behavioural.command;

// Receiver
public class TextDocument {
    private StringBuilder content = new StringBuilder();

    public void write(String text) {
        content.append(text);
    }

    public void delete(int length) {
        int start = content.length() - length;
        content.delete(start, content.length());
    }

    public String getContent() {
        return content.toString();
    }
}
