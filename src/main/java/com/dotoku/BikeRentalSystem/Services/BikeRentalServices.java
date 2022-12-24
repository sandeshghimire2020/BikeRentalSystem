package com.dotoku.BikeRentalSystem.Services;

import com.dotoku.BikeRentalSystem.Models.Member;
import com.dotoku.BikeRentalSystem.Repository.CarRentalRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BikeRentalServices {

    @Autowired
    private CarRentalRepository carRentalRepository;

    public List<Member> getAllMembers(){
        return carRentalRepository.findAll();
    }


}
