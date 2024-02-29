package ParkingLot.model;

import ParkingLot.model.enums.PaymentMode;
import ParkingLot.model.enums.PaymentStatus;

import java.time.LocalDateTime;

public class Payment extends BaseModel{
    private double amount;
    private String transactionRefNumber;
    private PaymentMode paymentMode;
    private Bill bill;
    private PaymentStatus paymentStatus;
    private LocalDateTime paymentTime;

    public Payment(double amount, String transactionRefNumber, PaymentMode paymentMode, Bill bill, PaymentStatus paymentStatus, LocalDateTime paymentTime) {
        this.amount = amount;
        this.transactionRefNumber = transactionRefNumber;
        this.paymentMode = paymentMode;
        this.bill = bill;
        this.paymentStatus = paymentStatus;
        this.paymentTime = paymentTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionRefNumber() {
        return transactionRefNumber;
    }

    public void setTransactionRefNumber(String transactionRefNumber) {
        this.transactionRefNumber = transactionRefNumber;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }
}
