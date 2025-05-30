package designpatterns.creational.objectpool;

public class Main {
    public static void main(String[] args) {
        ObjectPool pool = new ObjectPool(3);

        Resource r1 = pool.acquire();
        r1.use();

        Resource r2 = pool.acquire();
        r2.use();

        pool.release(r1);

        Resource r3 = pool.acquire();  // should reuse r1
        r3.use();

        pool.release(r2);
        pool.release(r3);
    }
}
