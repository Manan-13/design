package lld.parkinglotsystem;

import java.time.LocalDateTime;

public class CarPricingStrategy implements PricingStrategy {
    @Override
    public int calculateFare(LocalDateTime entryTime, LocalDateTime exitTime) {
        return (exitTime.getHour() - entryTime.getHour() + 1)* 20;
    }
}
