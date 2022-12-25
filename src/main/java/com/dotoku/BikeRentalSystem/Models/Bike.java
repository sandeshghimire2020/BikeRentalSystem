package com.dotoku.BikeRentalSystem.Models;


import jakarta.persistence.*;

@Entity
@Table(name="bike")
public class Bike {

    @Id
    private long bikeId;

    @ManyToOne
    private Manufacture manufacturer;

    @Column(name="bike_category")
    private String bikeCategory;
    @Column(name="bike_description")
    private String bikeDescription;
    @Column(name="bike_status")
    private String bikeStatus;
    @Column(name="bike_location")
    private String bikeLocation;

    @ManyToOne
    private Location location;

    public Bike() {
    }

    public Bike(long bikeId, Manufacture manufacturer, String bikeCategory, String bikeDescription, String bikeStatus, String bikeLocation, Location location) {
        this.bikeId = bikeId;
        this.manufacturer = manufacturer;
        this.bikeCategory = bikeCategory;
        this.bikeDescription = bikeDescription;
        this.bikeStatus = bikeStatus;
        this.bikeLocation = bikeLocation;
        this.location = location;
    }

    public long getBikeId() {
        return bikeId;
    }

    public void setBikeId(long bikeId) {
        this.bikeId = bikeId;
    }

    public Manufacture getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacture manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getBikeCategory() {
        return bikeCategory;
    }

    public void setBikeCategory(String bikeCategory) {
        this.bikeCategory = bikeCategory;
    }

    public String getBikeDescription() {
        return bikeDescription;
    }

    public void setBikeDescription(String bikeDescription) {
        this.bikeDescription = bikeDescription;
    }

    public String getBikeStatus() {
        return bikeStatus;
    }

    public void setBikeStatus(String bikeStatus) {
        this.bikeStatus = bikeStatus;
    }

    public String getBikeLocation() {
        return bikeLocation;
    }

    public void setBikeLocation(String bikeLocation) {
        this.bikeLocation = bikeLocation;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "bikeId=" + bikeId +
                ", manufacturer=" + manufacturer +
                ", bikeCategory='" + bikeCategory + '\'' +
                ", bikeDescription='" + bikeDescription + '\'' +
                ", bikeStatus='" + bikeStatus + '\'' +
                ", bikeLocation='" + bikeLocation + '\'' +
                ", location=" + location +
                '}';
    }
}
