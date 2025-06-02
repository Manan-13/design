package lld.ratelimiter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RateLimiter {
    private final Map<String, TokenBucket> userBuckets = new ConcurrentHashMap<>();
    private final int capacity;
    private final int refillRate;

    public RateLimiter(int capacity, int refillRate) {
        this.capacity = capacity;
        this.refillRate = refillRate;
    }

    public boolean isAllowed(String userId) {
        userBuckets.putIfAbsent(userId, new TokenBucket(capacity, refillRate));
        return userBuckets.get(userId).allowRequest();
    }
}
