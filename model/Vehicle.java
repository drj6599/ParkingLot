package ParkingLot.model;

import ParkingLot.model.enums.VehicleClass;
import ParkingLot.model.enums.VehicleType;

public class Vehicle extends BaseModel{

    private VehicleType vehicleType;
    private VehicleClass vehicleClass;

    private String vehicleNumber;
    private String vehicleColor;

    public Vehicle(VehicleType vehicleType, VehicleClass vehicleClass, String vehicleNumber, String vehicleColor) {
        this.vehicleType = vehicleType;
        this.vehicleClass = vehicleClass;
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

    public VehicleClass getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(VehicleClass vehicleClass) {
        this.vehicleClass = vehicleClass;
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
