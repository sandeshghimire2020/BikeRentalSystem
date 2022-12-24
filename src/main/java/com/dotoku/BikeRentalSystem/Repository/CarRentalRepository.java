package com.dotoku.BikeRentalSystem.Repository;

import com.dotoku.BikeRentalSystem.Models.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRentalRepository extends JpaRepository<Member,Integer> {

}
