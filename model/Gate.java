package ParkingLot.model;

import ParkingLot.model.enums.GateStatus;
import ParkingLot.model.enums.GateType;

public class Gate extends BaseModel{
    private GateType gateType;
    private GateStatus gateStatus;
    private int gateNumber;
    private String operator;

    public Gate(GateType gateType, GateStatus gateStatus, int gateNumber, String operator) {
        this.gateType = gateType;
        this.gateStatus = gateStatus;
        this.gateNumber = gateNumber;
        this.operator = operator;
    }

    public Gate()
    {

    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
