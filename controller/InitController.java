package ParkingLot.controller;

import ParkingLot.model.ParkingLot;
import ParkingLot.service.InitialisationService;

public class InitController {
    private InitialisationService initialisationService;

    public InitController(InitialisationService initialisationService) {
        this.initialisationService = initialisationService;
    }

    public ParkingLot init()
    {
        return initialisationService.init();
    }
}
