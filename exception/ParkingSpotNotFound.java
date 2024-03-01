package ParkingLot.exception;

public class ParkingSpotNotFound extends RuntimeException {

    public ParkingSpotNotFound() {
        super();
    }

    public ParkingSpotNotFound(String message) {
        super(message);
    }

    public ParkingSpotNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public ParkingSpotNotFound(Throwable cause) {
        super(cause);
    }

    protected ParkingSpotNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
