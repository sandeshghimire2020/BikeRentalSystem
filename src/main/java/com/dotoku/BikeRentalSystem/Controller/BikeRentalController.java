package com.dotoku.BikeRentalSystem.Controller;

import com.dotoku.BikeRentalSystem.Models.Bike;
import com.dotoku.BikeRentalSystem.Models.Location;
import com.dotoku.BikeRentalSystem.Models.Member;
import com.dotoku.BikeRentalSystem.Models.RentalDetails;
import com.dotoku.BikeRentalSystem.Services.BikeRentalServices;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(path="api/v1/")
public class BikeRentalController {


    private final BikeRentalServices bikeRentalServices;

    @Autowired
    public BikeRentalController(BikeRentalServices bikeRentalServices) {
        this.bikeRentalServices = bikeRentalServices;
    }





    @GetMapping("/rentaldetails")
    public  List<RentalDetails> getRentalDetails(){
        return bikeRentalServices.getRentalDetails();
    }

    @GetMapping("/rentaldetails/{rentalId}")
    public List<RentalDetails> getRentalDetailsById(@PathVariable long rentalId){
        return bikeRentalServices.getRentalDetailsById(rentalId);
    }


    @GetMapping("/bikes")
    public List<Bike> getBikes(){
        return bikeRentalServices.getBikes();
    }

    //search bikes by zip

    @GetMapping("/bikes/{zip}")
    public List<Bike> getBikesById(@PathVariable long zip){
        return bikeRentalServices.getBikesById(zip);
    }

    //search bikes by category


    @GetMapping("/locations")
    public List<Location> getLocation(){
        return bikeRentalServices.getLocation();
    }

    @GetMapping("/locations/{id}")
    public List<Location> getLocationById(@PathVariable long id){
        return bikeRentalServices.getLocationById(id);
    }

    //make api where user can get their profile
    @GetMapping("/users")
    public List<Member> getMembers(){
        return bikeRentalServices.getMembers();
    }

    @GetMapping("users/{id}")
    public List<Member> getMemberByIfd(@PathVariable long id){
        return bikeRentalServices.getMemberById(id);
    }





}
