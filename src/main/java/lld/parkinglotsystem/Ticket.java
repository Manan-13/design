package lld.parkinglotsystem;

import java.time.Instant;
import java.time.LocalDateTime;

public class Ticket {

    private Vehicle vehicle;
    private LocalDateTime creationTime;
    private ParkingSpot spot;

    public Ticket(Vehicle vehicle, LocalDateTime creationTime, ParkingSpot spot) {
        this.vehicle = vehicle;
        this.creationTime = creationTime;
        this.spot = spot;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }
}
