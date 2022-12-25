package com.dotoku.BikeRentalSystem.Models;


import jakarta.persistence.*;

@Entity
@Table(name="Member")
public class Member {

    @Id
    private long memId;

    @Column(name="member_FN")
    private String memFN;

    @Column(name="member_LN")
    private String memLN;

    @Column(name="member_phone")
    private String memPhone;

    @Column(name="member_address")
    private String momAddress;

    @Column(name="member_Reg_date")
    private String memRegDate;

    @Column(name="member_balance")
    private float memBalance;

    @Column(name="member_late_fee")
    private float lateFee;


    public Member() {
    }

    public Member(long memId, String memFN, String memLN, String memPhone, String momAddress, String memRegDate, float memBalance, float lateFee) {
        this.memId = memId;
        this.memFN = memFN;
        this.memLN = memLN;
        this.memPhone = memPhone;
        this.momAddress = momAddress;
        this.memRegDate = memRegDate;
        this.memBalance = memBalance;
        this.lateFee = lateFee;
    }

    public long getMemId() {
        return memId;
    }

    public void setMemId(long memId) {
        this.memId = memId;
    }

    public String getMemFN() {
        return memFN;
    }

    public void setMemFN(String memFN) {
        this.memFN = memFN;
    }

    public String getMemLN() {
        return memLN;
    }

    public void setMemLN(String memLN) {
        this.memLN = memLN;
    }

    public String getMemPhone() {
        return memPhone;
    }

    public void setMemPhone(String memPhone) {
        this.memPhone = memPhone;
    }

    public String getMomAddress() {
        return momAddress;
    }

    public void setMomAddress(String momAddress) {
        this.momAddress = momAddress;
    }

    public String getMemRegDate() {
        return memRegDate;
    }

    public void setMemRegDate(String memRegDate) {
        this.memRegDate = memRegDate;
    }

    public float getMemBalance() {
        return memBalance;
    }

    public void setMemBalance(float memBalance) {
        this.memBalance = memBalance;
    }

    public float getLateFee() {
        return lateFee;
    }

    public void setLateFee(float lateFee) {
        this.lateFee = lateFee;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memId=" + memId +
                ", memFN='" + memFN + '\'' +
                ", memLN='" + memLN + '\'' +
                ", memPhone='" + memPhone + '\'' +
                ", momAddress='" + momAddress + '\'' +
                ", memRegDate='" + memRegDate + '\'' +
                ", memBalance=" + memBalance +
                ", lateFee=" + lateFee +
                '}';
    }
}

