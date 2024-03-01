package ParkingLot.exception;

public class ParkingFloorNotFound extends RuntimeException {
    public ParkingFloorNotFound() {
        super();
    }

    public ParkingFloorNotFound(String message) {
        super(message);
    }

    public ParkingFloorNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public ParkingFloorNotFound(Throwable cause) {
        super(cause);
    }

    protected ParkingFloorNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
