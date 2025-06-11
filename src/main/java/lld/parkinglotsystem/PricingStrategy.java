package lld.parkinglotsystem;

import java.time.LocalDateTime;

public interface PricingStrategy {
    int calculateFare(LocalDateTime entryTime, LocalDateTime exitTime);
}
