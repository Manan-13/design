package designpatterns.creational.prototype;

public class Main {
    public static void main(String[] args) {
        ShapeRegistry registry = new ShapeRegistry();

        // Register prototypes
        registry.addPrototype("big-circle", new Circle(10, "Red"));
        registry.addPrototype("small-rectangle", new Rectangle(2, 4, "Blue"));

        // Clone from prototypes
        Shape shape1 = registry.getClone("big-circle");
        shape1.draw();

        Shape shape2 = registry.getClone("small-rectangle");
        shape2.draw();

        Shape shape3 = registry.getClone("big-circle");
        shape3.draw();
    }
}
