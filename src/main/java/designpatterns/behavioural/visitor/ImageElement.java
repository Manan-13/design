package designpatterns.behavioural.visitor;

public class ImageElement implements DocumentElement{
    private String img;
    public ImageElement(String img) {
        this.img = img;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }

    public String getImg() {
        return img;
    }
}
