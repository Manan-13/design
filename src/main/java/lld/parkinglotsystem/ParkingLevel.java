package lld.parkinglotsystem;

import java.util.*;

public class ParkingLevel {

    private Map<String, ParkingSpot> parkingSpotMap= new HashMap<>();
    private int level;
//    Map<VehicleType, Set<ParkingSpot>> availableSpotsByType;

    ParkingLevel(int numLevel, int spots){
        level = numLevel;
        for(int i=1; i<=spots; i++){
            for(VehicleType type: VehicleType.values()){
                this.parkingSpotMap.put(type.name()+i, new ParkingSpot(type.name()+i, type, this));
            }
        }
    }

    public boolean isSpotAvailable(VehicleType type){
        for(Map.Entry<String, ParkingSpot> parkingSpotEntry: parkingSpotMap.entrySet()){
            ParkingSpot spot = parkingSpotEntry.getValue();
            if(!spot.isOccupied() && spot.getSupportedType().equals(type)){
                return true;
            }
        }
        return false;
    }

    public ParkingSpot bookSpot(Vehicle vehicle){
        for(Map.Entry<String, ParkingSpot> parkingSpotEntry: parkingSpotMap.entrySet()){
            ParkingSpot spot = parkingSpotEntry.getValue();
            if(!spot.isOccupied() && spot.getSupportedType().equals(vehicle.getVehicleType())){
                spot.setOccupied(true);
                spot.setParkedVehicle(vehicle);
                return spot;
            }
        }
        throw new RuntimeException("Tried to book a spot but spot isn't available");
    }

    public void freeSpot(ParkingSpot spot){
        parkingSpotMap.get(spot.getSpotId()).setOccupied(false);
        parkingSpotMap.get(spot.getSpotId()).setParkedVehicle(null);
    }
}
