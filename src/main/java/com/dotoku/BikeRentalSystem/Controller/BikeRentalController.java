package com.dotoku.BikeRentalSystem.Controller;

import com.dotoku.BikeRentalSystem.Models.Member;
import com.dotoku.BikeRentalSystem.Services.BikeRentalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/")
public class BikeRentalController {


    private final BikeRentalServices bikeRentalServices;

    @Autowired
    public BikeRentalController(BikeRentalServices bikeRentalServices) {
        this.bikeRentalServices = bikeRentalServices;
    }


    @GetMapping("/members")
    public List<Member> getAllMembers(){
        return bikeRentalServices.getAllMembers();
    }

}
