package com.dotoku.BikeRentalSystem.Models;

import jakarta.persistence.*;

@Entity
@Table(name="staff")
public class Staff {

    @Id
    private String staffId;

    @Column(name="staff_FN")
    private String staffFN;

    @Column(name="staff_LN")
    private String staffLN;

    @Column(name="staff_position")
    private String staffPosition;

    @Column(name="staff_address")
    private String staffAddress;

    @Column(name="staff_phone")
    private long staffPhone;

    @ManyToOne
    private Location location;

    public Staff() {
    }

    public Staff(String staffId, String staffFN, String staffLN, String staffPosition, String staffAddress, long staffPhone, Location location) {
        this.staffId = staffId;
        this.staffFN = staffFN;
        this.staffLN = staffLN;
        this.staffPosition = staffPosition;
        this.staffAddress = staffAddress;
        this.staffPhone = staffPhone;
        this.location = location;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffFN() {
        return staffFN;
    }

    public void setStaffFN(String staffFN) {
        this.staffFN = staffFN;
    }

    public String getStaffLN() {
        return staffLN;
    }

    public void setStaffLN(String staffLN) {
        this.staffLN = staffLN;
    }

    public String getStaffPosition() {
        return staffPosition;
    }

    public void setStaffPosition(String staffPosition) {
        this.staffPosition = staffPosition;
    }

    public String getStaffAddress() {
        return staffAddress;
    }

    public void setStaffAddress(String staffAddress) {
        this.staffAddress = staffAddress;
    }

    public long getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(long staffPhone) {
        this.staffPhone = staffPhone;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId=" + staffId +
                ", staffFN='" + staffFN + '\'' +
                ", staffLN='" + staffLN + '\'' +
                ", staffPosition='" + staffPosition + '\'' +
                ", staffAddress='" + staffAddress + '\'' +
                ", staffPhone='" + staffPhone + '\'' +
                ", location=" + location +
                '}';
    }
}
