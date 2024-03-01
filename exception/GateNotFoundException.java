package ParkingLot.exception;

public class GateNotFoundException extends RuntimeException {
    public GateNotFoundException(String s) {
        super(s);
    }
}
