package com.dotoku.BikeRentalSystem.Repository;


import com.dotoku.BikeRentalSystem.Models.RentalDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalDetailsRepository extends JpaRepository<RentalDetails,Long> {
}
