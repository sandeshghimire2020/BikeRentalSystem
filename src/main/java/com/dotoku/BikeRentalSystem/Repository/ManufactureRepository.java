package com.dotoku.BikeRentalSystem.Repository;

import com.dotoku.BikeRentalSystem.Models.Manufacture;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufactureRepository extends JpaRepository<Manufacture,String> {
}
