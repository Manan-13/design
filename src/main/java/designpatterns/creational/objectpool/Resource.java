package designpatterns.creational.objectpool;

public class Resource {
    private final int id;

    public Resource(int id) {
        this.id = id;
        System.out.println("Created Resource #" + id);
    }

    public void use() {
        System.out.println("Using Resource #" + id);
    }

    public int getId() {
        return id;
    }
}
