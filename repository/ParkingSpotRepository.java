package ParkingLot.repository;

import ParkingLot.exception.ParkingSpotNotFound;
import ParkingLot.model.ParkingSpot;

import java.util.HashMap;
import java.util.Map;

public class ParkingSpotRepository {
    private static ParkingSpotRepository instance;

    private Map<Integer, ParkingSpot> parkingSpotMap;

    private ParkingSpotRepository()
    {
        parkingSpotMap = new HashMap<>();
    }

    public static ParkingSpotRepository getInstance()
    {
        if(instance == null)
        {
            return new ParkingSpotRepository();
        }
        return instance;
    }

    public ParkingSpot getParkingSpot(int parkingSpotId)
    {
        ParkingSpot parkingSpot = parkingSpotMap.get(parkingSpotId);
        if(parkingSpot == null)
        {
            throw new ParkingSpotNotFound("ParkingSpot not found for id : " + parkingSpotId);
        }
        return parkingSpot;
    }

    public void addParkingSpotToRepository(ParkingSpot parkingSpot)
    {
        parkingSpotMap.put(parkingSpot.getId(), parkingSpot);
        System.out.println("Parking Spot added to the Repository Successfully");
    }
}
