package ParkingLot.service.startegy.BillCalculationStrategy;

import ParkingLot.model.Bill;
import ParkingLot.model.Ticket;

public interface BillCalculationStrategy {
    Bill generateBill(Ticket ticket);
}
