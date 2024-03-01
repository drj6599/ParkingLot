package ParkingLot.repository;

import ParkingLot.exception.ParkingFloorNotFound;
import ParkingLot.model.ParkingFloor;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepository {

    private static ParkingFloorRepository instance;

    private Map<Integer, ParkingFloor> parkingFloorMap;

    private ParkingFloorRepository()
    {
        parkingFloorMap = new HashMap<>();
    }

    public static ParkingFloorRepository getInstance()
    {
        if(instance == null)
        {
            return new ParkingFloorRepository();
        }
        return instance;
    }

    public ParkingFloor getParkingFloor(int parkingFloorId)
    {
        ParkingFloor parkingFloor = parkingFloorMap.get(parkingFloorId);
        if(parkingFloor == null)
        {
            throw new ParkingFloorNotFound("Parking Floor with id " + parkingFloorId + " does not exist");
        }
        return parkingFloor;
    }

    public void addParkingFloorToRepository(ParkingFloor parkingFloor)
    {
        parkingFloorMap.put(parkingFloor.getId(), parkingFloor);
        System.out.println("Parking Floor Added to Repository Successfully");
    }
}
