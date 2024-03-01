package ParkingLot.model;

import ParkingLot.model.enums.ParkingSpotStatus;

public class LuxeParkingSpot extends BaseModel implements ParkingSpot{
    private int spotNumber;
    private ParkingSpotStatus parkingSpotStatus;
    private Vehicle vehicle;

    public LuxeParkingSpot(int spotNumber, ParkingSpotStatus parkingSpotStatus, Vehicle vehicle) {
        this.spotNumber = spotNumber;

        this.parkingSpotStatus = parkingSpotStatus;
        this.vehicle = vehicle;
    }

    public LuxeParkingSpot()
    {

    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }


    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
