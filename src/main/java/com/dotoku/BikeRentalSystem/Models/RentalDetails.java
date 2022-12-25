package com.dotoku.BikeRentalSystem.Models;

import jakarta.persistence.*;

@Entity
@Table(name="rental_details")
public class RentalDetails {

    @Id
    private long rentalFeeId;

    @ManyToOne
    private Transaction transaction;

    private String expireDate;

    private String checkOutLocation;

    private String actualReturnDate;

    @ManyToOne
    private Bike bike;

    @OneToOne
    private Member member;

    @Column(name="return_location")
    private String returnLocation;


    public RentalDetails() {
    }

    public RentalDetails(long rentalFeeId, Transaction transaction, String expireDate, String checkOutLocation, String actualReturnDate, Bike bike, Member member, String returnLocation) {
        this.rentalFeeId = rentalFeeId;
        this.transaction = transaction;
        this.expireDate = expireDate;
        this.checkOutLocation = checkOutLocation;
        this.actualReturnDate = actualReturnDate;
        this.bike = bike;
        this.member = member;
        this.returnLocation = returnLocation;
    }

    public long getRentalFeeId() {
        return rentalFeeId;
    }

    public void setRentalFeeId(long rentalFeeId) {
        this.rentalFeeId = rentalFeeId;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getCheckOutLocation() {
        return checkOutLocation;
    }

    public void setCheckOutLocation(String checkOutLocation) {
        this.checkOutLocation = checkOutLocation;
    }

    public String getActualReturnDate() {
        return actualReturnDate;
    }

    public void setActualReturnDate(String actualReturnDate) {
        this.actualReturnDate = actualReturnDate;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String getReturnLocation() {
        return returnLocation;
    }

    public void setReturnLocation(String returnLocation) {
        this.returnLocation = returnLocation;
    }

    @Override
    public String toString() {
        return "RentalDetails{" +
                "rentalFeeId=" + rentalFeeId +
                ", transaction=" + transaction +
                ", expireDate='" + expireDate + '\'' +
                ", checkOutLocation='" + checkOutLocation + '\'' +
                ", actualReturnDate='" + actualReturnDate + '\'' +
                ", bike=" + bike +
                ", member=" + member +
                ", returnLocation='" + returnLocation + '\'' +
                '}';
    }
}
