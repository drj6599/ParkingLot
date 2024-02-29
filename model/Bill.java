package ParkingLot.model;

import ParkingLot.model.enums.BillStatus;

import java.time.LocalDateTime;

public class Bill extends BaseModel{
    private Ticket ticket;
    private LocalDateTime exitTime;
    private double amount;
    private Gate exitGate;
    private BillStatus billStatus;

    public Bill(Ticket ticket, LocalDateTime exitTime, double amount, Gate exitGate, BillStatus billStatus) {
        this.ticket = ticket;
        this.exitTime = exitTime;
        this.amount = amount;
        this.exitGate = exitGate;
        this.billStatus = billStatus;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }
}
