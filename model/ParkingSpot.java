package ParkingLot.model;

import ParkingLot.model.enums.ParkingSpotStatus;

public interface ParkingSpot{

    int getId();
    public int getSpotNumber();
    public void setSpotNumber(int SpotNumber);
    public ParkingSpotStatus getParkingSpotStatus();
    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus);
    public Vehicle getVehicle();
    public void setVehicle(Vehicle vehicle);
}
