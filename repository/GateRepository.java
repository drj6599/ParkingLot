package ParkingLot.repository;

import ParkingLot.model.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    private static GateRepository instance;
    private Map<Integer, Gate> gateMap;

    private GateRepository()
    {
        gateMap = new HashMap<>();
    }

    public static GateRepository getInstance()
    {
        if(instance == null)
        {
            return new GateRepository();
        }
        return instance;
    }
}
