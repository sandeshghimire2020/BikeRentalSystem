package com.dotoku.BikeRentalSystem.Repository;

import com.dotoku.BikeRentalSystem.Models.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff,String> {
}
