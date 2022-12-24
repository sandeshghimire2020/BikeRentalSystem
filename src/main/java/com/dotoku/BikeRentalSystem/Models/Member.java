package com.dotoku.BikeRentalSystem.Models;


import jakarta.persistence.*;

@Entity
@Table(name="Member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer memId;

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
    private String memBalance;
    @Column(name="member_late_fee")
    private String lateFee;


    public Member() {
    }

    public Member(String memFN, String memLN, String memPhone, String momAddress, String memRegDate, String memBalance, String lateFee) {
        this.memFN = memFN;
        this.memLN = memLN;
        this.memPhone = memPhone;
        this.momAddress = momAddress;
        this.memRegDate = memRegDate;
        this.memBalance = memBalance;
        this.lateFee = lateFee;
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

    public String getMemBalance() {
        return memBalance;
    }

    public void setMemBalance(String memBalance) {
        this.memBalance = memBalance;
    }

    public String getLateFee() {
        return lateFee;
    }

    public void setLateFee(String lateFee) {
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
                ", memBalance='" + memBalance + '\'' +
                ", lateFee='" + lateFee + '\'' +
                '}';
    }
}
