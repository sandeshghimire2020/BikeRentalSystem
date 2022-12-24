package com.dotoku.BikeRentalSystem.Controller;

import com.dotoku.BikeRentalSystem.Models.Member;
import com.dotoku.BikeRentalSystem.Repository.CarRentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class BikeRentalController {

    @Autowired
    private CarRentalRepository carRentalRepository;


    @GetMapping("/members")
    public List<Member> getAllMembers(){
        return carRentalRepository.findAll();
    }
}
