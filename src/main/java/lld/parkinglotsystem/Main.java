package lld.parkinglotsystem;

public class Main {
    public static void main(String[] args) {

        MultiLevelParkingLot lot = new MultiLevelParkingLot(3, 10);
        Ticket ticket = lot.parkAndRaiseTicket(new Vehicle("MH12AB1234", VehicleType.CAR));

        int fare = lot.unParkAndPayTicket(ticket);
        System.out.println("Amount to pay: ₹" + fare); // ₹40 for car
    }
}
