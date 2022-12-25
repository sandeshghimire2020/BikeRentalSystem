package com.dotoku.BikeRentalSystem.Repository;

import com.dotoku.BikeRentalSystem.Models.Bike;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BikeRepository extends JpaRepository<Bike,Long> {

}
