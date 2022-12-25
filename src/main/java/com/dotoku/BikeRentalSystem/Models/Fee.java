package com.dotoku.BikeRentalSystem.Models;

import jakarta.persistence.*;

@Entity
@Table(name="fee")
public class Fee {

    @Id
    private long feeId;

    @Column(name="daily_fee")
    private float dailyFee;

    @ManyToOne
    private RentalDetails rentalDetails;

    public Fee() {
    }

    public Fee(long feeId, float dailyFee, RentalDetails rentalDetails) {
        this.feeId = feeId;
        this.dailyFee = dailyFee;
        this.rentalDetails = rentalDetails;
    }

    public long getFeeId() {
        return feeId;
    }

    public void setFeeId(long feeId) {
        this.feeId = feeId;
    }

    public float getDailyFee() {
        return dailyFee;
    }

    public void setDailyFee(float dailyFee) {
        this.dailyFee = dailyFee;
    }

    public RentalDetails getRentalDetails() {
        return rentalDetails;
    }

    public void setRentalDetails(RentalDetails rentalDetails) {
        this.rentalDetails = rentalDetails;
    }

    @Override
    public String toString() {
        return "Fee{" +
                "feeId=" + feeId +
                ", dailyFee=" + dailyFee +
                ", rentalDetails=" + rentalDetails +
                '}';
    }
}
