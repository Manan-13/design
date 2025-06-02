package lld.ratelimiter;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        RateLimiter limiter = new RateLimiter(5, 1); // 5 tokens, 1 per second

        for (int i = 0; i < 10; i++) {
            System.out.println("Request " + i + ": " + limiter.isAllowed("user1"));
            Thread.sleep(200); // 200 ms between requests
        }
    }
}
