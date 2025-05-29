package designpatterns.creational.prototype;

public class Rectangle implements Shape {
    private int width;
    private int height;
    private String color;

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle: " + width + "x" + height + ", color = " + color);
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this.width, this.height, this.color);
    }
}
