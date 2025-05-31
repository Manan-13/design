package designpatterns.behavioural.visitor;

public class RenderingVisitor implements DocumentVisitor{
    public void visit(TextElement text) {
        System.out.println("Rendering text: " + text.getText());
    }

    public void visit(ImageElement image) {
        System.out.println("Rendering image from path: " + image.getImg());
    }
}
