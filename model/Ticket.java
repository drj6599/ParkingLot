package ParkingLot.model;

import java.time.LocalDateTime;

public class Ticket extends BaseModel{
    private Vehicle vehicle;
    private LocalDateTime entryTime;
    private ParkingSpot allotedParkingSpot;
    private Gate entryGate;

    public Ticket(Vehicle vehicle, LocalDateTime entryTime, ParkingSpot allotedParkingSpot, Gate entryGate) {
        this.vehicle = vehicle;
        this.entryTime = entryTime;
        this.allotedParkingSpot = allotedParkingSpot;
        this.entryGate = entryGate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public ParkingSpot getAllotedParkingSpot() {
        return allotedParkingSpot;
    }

    public void setAllotedParkingSpot(ParkingSpot allotedParkingSpot) {
        this.allotedParkingSpot = allotedParkingSpot;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }
}
