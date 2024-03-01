package ParkingLot.service;

import ParkingLot.model.*;
import ParkingLot.model.enums.*;
import ParkingLot.repository.GateRepository;
import ParkingLot.repository.ParkingFloorRepository;
import ParkingLot.repository.ParkingLotRepository;
import ParkingLot.repository.ParkingSpotRepository;

import java.util.ArrayList;
import java.util.List;

public class InitialisationService {
    private GateRepository gateRepository;
    private ParkingSpotRepository parkingSpotRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingLotRepository parkingLotRepository;

    public InitialisationService(GateRepository gateRepository, ParkingSpotRepository parkingSpotRepository, ParkingFloorRepository parkingFloorRepository, ParkingLotRepository parkingLotRepository) {
        this.gateRepository = gateRepository;
        this.parkingSpotRepository = parkingSpotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.parkingLotRepository = parkingLotRepository;
    }

    public ParkingLot init(){
        System.out.println("--------Starting the initialisation of Repositories--------");

        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName("BeSecure Parking Lot");
        parkingLot.setAddress("PhoenixMall Millenium, Wakad");
        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setCapacity(100);
        parkingLot.setVehicleTypes(List.of(VehicleType.TWO_WHEELER,VehicleType.FOUR_WHEELER,VehicleType.EV,VehicleType.LUXURY));

        List<ParkingFloor> floors = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            ParkingFloor parkingFloor = new ParkingFloor();
            parkingFloor.setFloorNumber(i);
            parkingFloor.setFloorStatus(FloorStatus.OPERATIONAL);
            parkingFloor.setFloorNumber(i);

            List<ParkingSpot> spots = new ArrayList<>();
            for (int j = 1; j <= 20; j++) {
                if(j > 0 && j <= 8)
                {
                    ParkingSpot parkingSpot = new FourWheelParkingSpot();
                    parkingSpot.setSpotNumber(j*7+i*29);
                    parkingSpot.setParkingSpotStatus(ParkingSpotStatus.EMPTY);
                    spots.add(parkingSpot);
                    parkingSpotRepository.addParkingSpotToRepository(parkingSpot);
                }
                if(j > 8 && j <= 15)
                {
                    ParkingSpot parkingSpot = new TwoWheelParkingSpot();
                    parkingSpot.setSpotNumber(j*7+i*29);
                    parkingSpot.setParkingSpotStatus(ParkingSpotStatus.EMPTY);
                    spots.add(parkingSpot);
                    parkingSpotRepository.addParkingSpotToRepository(parkingSpot);
                }
                if(j > 15 && j <= 18)
                {
                    ParkingSpot parkingSpot = new EVParkingSpot();
                    parkingSpot.setSpotNumber(j*7+i*29);
                    parkingSpot.setParkingSpotStatus(ParkingSpotStatus.EMPTY);
                    spots.add(parkingSpot);
                    parkingSpotRepository.addParkingSpotToRepository(parkingSpot);
                }
                if (j > 18)
                {
                    ParkingSpot parkingSpot = new LuxeParkingSpot();
                    parkingSpot.setSpotNumber(j*7+i*29);
                    parkingSpot.setParkingSpotStatus(ParkingSpotStatus.EMPTY);
                    spots.add(parkingSpot);
                    parkingSpotRepository.addParkingSpotToRepository(parkingSpot);
                }
            }
            parkingFloor.setSpots(spots);
            Gate entryGate = new Gate();
            entryGate.setId((i*1000) + 1);
            entryGate.setGateNumber(i*100 + 1);
            entryGate.setGateStatus(GateStatus.OPERATIONAL);
            entryGate.setGateType(GateType.ENTRY);
            entryGate.setOperator("Operator : " + i + 1);
            parkingFloor.setEntryGate(entryGate);
            gateRepository.put(entryGate);

            //creating exit gate object
            Gate exitGate = new Gate();
            exitGate.setId((i*1000) + 2);
            exitGate.setGateNumber(i*100 + 2);
            exitGate.setGateStatus(GateStatus.OPERATIONAL);
            exitGate.setGateType(GateType.EXIT);
            exitGate.setOperator("Operator : " + i + 2);
            parkingFloor.setExitGate(exitGate);
            gateRepository.put(exitGate);

            floors.add(parkingFloor);
            parkingFloorRepository.addParkingFloorToRepository(parkingFloor);

        }
        parkingLot.setFloors(floors);
        parkingLotRepository.put(parkingLot);
        return parkingLotRepository.get(1);
    }
}
