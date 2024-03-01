package ParkingLot;

import ParkingLot.controller.InitController;
import ParkingLot.model.ParkingLot;
import ParkingLot.repository.GateRepository;
import ParkingLot.repository.ParkingFloorRepository;
import ParkingLot.repository.ParkingLotRepository;
import ParkingLot.repository.ParkingSpotRepository;
import ParkingLot.service.InitialisationService;

public class ParkingLotMain {
    public static void main(String[] args) {
        GateRepository gateRepository = GateRepository.getInstance();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingFloorRepository parkingFloorRepository = ParkingFloorRepository.getInstance();
        ParkingSpotRepository parkingSpotRepository = ParkingSpotRepository.getInstance();
        InitialisationService initialisationService = new InitialisationService(gateRepository,parkingSpotRepository,parkingFloorRepository,parkingLotRepository);
        InitController initController = new InitController(initialisationService);

        ParkingLot parkingLot = initController.init();
        System.out.println("END");
    }
}
