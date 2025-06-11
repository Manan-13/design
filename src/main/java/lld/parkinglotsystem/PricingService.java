package lld.parkinglotsystem;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class PricingService {

    private Map<VehicleType, PricingStrategy> strategyMap;
    public PricingService() {
        strategyMap = new HashMap<>();
        strategyMap.put(VehicleType.BIKE, new BikePricingStrategy());
        strategyMap.put(VehicleType.CAR, new CarPricingStrategy());
    }

    public Integer getFare(Ticket ticket){
        PricingStrategy strategy = strategyMap.get(ticket.getVehicle().getVehicleType());
        return strategy.calculateFare(ticket.getCreationTime(), LocalDateTime.now());
    }
}
