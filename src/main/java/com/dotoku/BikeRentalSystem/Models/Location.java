package com.dotoku.BikeRentalSystem.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="location")
public class Location {

    @Id
    private long locationId;

    @Column(name="loc_state")
    private String state;

    @Column(name="loc_address")
    private String address;

    @Column(name="loc_city")
    private String city;

    @Column(name="loc_zip")
    private Integer zip;

    @Column(name="loc_phone")
    private String phone;

    public Location() {
    }

    public Location(long locationId, String state, String address, String city, Integer zip, String phone) {
        this.locationId = locationId;
        this.state = state;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.phone = phone;
    }


    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Location{" +
                "locationId=" + locationId +
                ", state='" + state + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", zip=" + zip +
                ", phone='" + phone + '\'' +
                '}';
    }
}


