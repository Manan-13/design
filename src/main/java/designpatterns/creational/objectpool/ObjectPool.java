package designpatterns.creational.objectpool;

import java.util.*;

public class ObjectPool {
    private Queue<Resource> available = new LinkedList<>();
    private Set<Resource> inUse = new HashSet<>();
    private int maxPoolSize;
    private int counter = 0;

    public ObjectPool(int maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
    }

    public synchronized Resource acquire() {
        if (!available.isEmpty()) {
            Resource resource = available.poll();
            inUse.add(resource);
            System.out.println("Reusing resource #" + resource.getId());
            return resource;
        }

        if (inUse.size() + available.size() < maxPoolSize) {
            Resource resource = new Resource(++counter);
            inUse.add(resource);
            return resource;
        }

        throw new RuntimeException("No resources available in pool.");
    }

    public synchronized void release(Resource resource) {
        if (inUse.remove(resource)) {
            available.offer(resource);
            System.out.println("Resource #" + resource.getId() + " released back to pool.");
        }
    }
}
