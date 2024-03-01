package ParkingLot.repository;

import ParkingLot.exception.GateNotFoundException;
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
    public Gate get(int gateId){
        Gate gate = gateMap.get(gateId);
        if(gate == null){
            throw new GateNotFoundException("Gate not found for id : " + gateId);
        }
        return gate;
    }

    public void put(Gate gate){
        gateMap.put(gate.getId(), gate);
        System.out.println("gate has been added successfully");
    }
}
