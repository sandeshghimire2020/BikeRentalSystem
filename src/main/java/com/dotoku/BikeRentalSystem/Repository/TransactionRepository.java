package com.dotoku.BikeRentalSystem.Repository;

import com.dotoku.BikeRentalSystem.Models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
