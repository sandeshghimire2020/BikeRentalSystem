package com.dotoku.BikeRentalSystem.Services;

import com.dotoku.BikeRentalSystem.Models.Bike;
import com.dotoku.BikeRentalSystem.Models.Location;
import com.dotoku.BikeRentalSystem.Models.Member;
import com.dotoku.BikeRentalSystem.Models.RentalDetails;
import com.dotoku.BikeRentalSystem.Repository.BikeRepository;
import com.dotoku.BikeRentalSystem.Repository.LocationRepository;
import com.dotoku.BikeRentalSystem.Repository.MemberRepository;
import com.dotoku.BikeRentalSystem.Repository.RentalDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BikeRentalServices {

    @Autowired
    private MemberRepository memberRepository;

    public List<Member> getAllMembers(){
        return memberRepository.findAll();
    }



    //Rental details of all members

    @Autowired
    private RentalDetailsRepository rentalDetailsRepository;

    public List<RentalDetails> getRentalDetails(){
        return rentalDetailsRepository.findAll();
    }

    //rental details of specific member

    public List<RentalDetails> getRentalDetailsById(long id){
       return rentalDetailsRepository.findAllById(Collections.singleton(id));
    }


    //Display all available bikes

    @Autowired
    private BikeRepository bikeRepository;


    public List<Bike> getBikes(){
        return bikeRepository.findAll();
    }


    public List<Bike> getBikesById(long zip){

        return bikeRepository.findAllById(Collections.singleton(zip));
    }

    @Autowired
    private LocationRepository locationRepository;

    public List<Location> getLocation(){
        return locationRepository.findAll();
    }

    public List<Location> getLocationById(long id){
        return locationRepository.findAllById(Collections.singleton(id));

    }



}
