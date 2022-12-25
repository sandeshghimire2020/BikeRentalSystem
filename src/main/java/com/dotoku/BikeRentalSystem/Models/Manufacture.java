package com.dotoku.BikeRentalSystem.Models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="manufacture")
public class Manufacture {

    @Id
    private String manId;
    @Column(name="man_name")
    private String manName;
    @Column(name="man_city")
    private String manCity;

    public Manufacture() {
    }

    public Manufacture(String manId, String manName, String manCity) {
        this.manId = manId;
        this.manName = manName;
        this.manCity = manCity;
    }

    public String getManId() {
        return manId;
    }

    public void setManId(String manId) {
        this.manId = manId;
    }

    public String getManName() {
        return manName;
    }

    public void setManName(String manName) {
        this.manName = manName;
    }

    public String getManCity() {
        return manCity;
    }

    public void setManCity(String manCity) {
        this.manCity = manCity;
    }

    @Override
    public String toString() {
        return "Manufacture{" +
                "manId=" + manId +
                ", manName='" + manName + '\'' +
                ", manCity='" + manCity + '\'' +
                '}';
    }
}
