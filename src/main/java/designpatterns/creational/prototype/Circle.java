package designpatterns.creational.prototype;

public class Circle implements Shape {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle: radius = " + radius + ", color = " + color);
    }

    @Override
    public Circle clone() {
        return new Circle(this.radius, this.color); // shallow copy
    }
}

