package lld.parkinglotsystem;

public class ParkingSpot {

    private String spotId;
    private Vehicle parkedVehicle;
    private VehicleType supportedType;
    private boolean isOccupied;
    private ParkingLevel level;

    ParkingSpot(String id, VehicleType type, ParkingLevel level){
        spotId = id;
        supportedType = type;
        this.level = level;
        isOccupied = false;
    }


    public boolean isOccupied() {
        return isOccupied;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public String getSpotId() {
        return spotId;
    }

    public void setParkedVehicle(Vehicle parkedVehicle) {
        this.parkedVehicle = parkedVehicle;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public ParkingLevel getLevel() {
        return level;
    }

    public VehicleType getSupportedType() {
        return supportedType;
    }
}
