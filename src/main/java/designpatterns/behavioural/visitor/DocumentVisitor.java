package designpatterns.behavioural.visitor;

public interface DocumentVisitor {
    void visit(TextElement text);
    void visit(ImageElement image);
}
