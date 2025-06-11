package lld.parkinglotsystem;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MultiLevelParkingLot {

    private List<ParkingLevel> levels;
    private PricingService pricingService;
    public MultiLevelParkingLot(int numLevels, int slotsPerLevel) {
        levels = new ArrayList<>();
        for(int i=1; i<=numLevels; i++){
            levels.add(new ParkingLevel(i, slotsPerLevel));
        }
        pricingService = new PricingService();
    }

    public Ticket parkAndRaiseTicket(Vehicle vehicle){
        for(ParkingLevel level: levels){
            if(level.isSpotAvailable(vehicle.getVehicleType())){
                ParkingSpot spotBooked = level.bookSpot(vehicle);
                return new Ticket(vehicle, LocalDateTime.now(), spotBooked);
            }
        }
        System.out.println("Parking Lot Full !");
        return null;
    }

    public int unParkAndPayTicket(Ticket ticket){
        ticket.getSpot().getLevel().freeSpot(ticket.getSpot());
        return pricingService.getFare(ticket);
    }

}
