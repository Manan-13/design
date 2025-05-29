package designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeRegistry {
    private Map<String, Shape> prototypes = new HashMap<>();

    public void addPrototype(String key, Shape prototype) {
        prototypes.put(key, prototype);
    }

    public Shape getClone(String key) {
        return prototypes.get(key).clone();
    }
}
