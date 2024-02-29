package ParkingLot.model;

import ParkingLot.model.enums.FloorStatus;

import java.util.List;

public class ParkingFloor extends BaseModel{
    private int floorNumber;
    private Gate entryGate;
    private Gate exitGate;
    private List<ParkingSpot> spots;
    private FloorStatus floorStatus;

    public ParkingFloor(int floorNumber, Gate entryGate, Gate exitGate, List<ParkingSpot> spots, FloorStatus floorStatus) {
        this.floorNumber = floorNumber;
        this.entryGate = entryGate;
        this.exitGate = exitGate;
        this.spots = spots;
        this.floorStatus = floorStatus;
    }

    public ParkingFloor()
    {

    }
    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public List<ParkingSpot> getSpots() {
        return spots;
    }

    public void setSpots(List<ParkingSpot> spots) {
        this.spots = spots;
    }

    public FloorStatus getFloorStatus() {
        return floorStatus;
    }

    public void setFloorStatus(FloorStatus floorStatus) {
        this.floorStatus = floorStatus;
    }
}
