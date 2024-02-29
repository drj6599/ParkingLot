package ParkingLot.service.startegy.SpotAllocationStrategy;

import ParkingLot.model.ParkingSpot;
import ParkingLot.model.Vehicle;

public interface SpotAllocationStrategy {
    ParkingSpot getSpotForVehicle(Vehicle vehicle);
}
