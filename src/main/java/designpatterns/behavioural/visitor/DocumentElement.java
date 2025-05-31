package designpatterns.behavioural.visitor;

public interface DocumentElement {
    void accept(DocumentVisitor visitor);
}
