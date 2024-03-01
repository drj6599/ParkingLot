package ParkingLot.model;


import ParkingLot.model.enums.VehicleType;

public class Vehicle extends BaseModel{

    private VehicleType vehicleType;
    private String vehicleNumber;
    private String vehicleColor;

    public Vehicle(VehicleType vehicleType, String vehicleNumber, String vehicleColor) {
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
        this.vehicleColor = vehicleColor;
    }

    public Vehicle()
    {

    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }
}
