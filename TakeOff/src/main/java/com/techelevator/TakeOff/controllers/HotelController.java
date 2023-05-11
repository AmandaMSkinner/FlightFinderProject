package com.techelevator.TakeOff.controllers;

import com.techelevator.TakeOff.models.responses.hotels.Hotel;
import com.techelevator.TakeOff.services.HotelApiService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    private HotelApiService hotelApiService;

    public HotelController(HotelApiService hotelApiService) {
        this.hotelApiService = hotelApiService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Hotel>> getHotelsByCity(
            @RequestParam(defaultValue = "") String city,
            @RequestParam(defaultValue = "") String keyword,
            @RequestParam(defaultValue = "") String subType,
            @RequestParam(defaultValue = "") String stars) {

        if (!city.isEmpty() && !stars.isEmpty()){
           return new ResponseEntity<>(hotelApiService.getHotelsByCityAndStars(city,stars), HttpStatus.OK);
        }

        if (!city.isEmpty()) {
            return new ResponseEntity<>(hotelApiService.getHotelsByCity(city), HttpStatus.OK);
        }

        if (!keyword.isEmpty() && !subType.isEmpty()) {
            return new ResponseEntity<>(hotelApiService.getHotelsAutoComplete(keyword, subType), HttpStatus.OK);
        }

        return new ResponseEntity(HttpStatus.BAD_REQUEST);


    }


    @RequestMapping(path = "/specialOffers", method = RequestMethod.GET)
    public List<Hotel> getHotelsWithSpecialOffers
    (@RequestParam int hotelID, @RequestParam int adults) {
        return hotelApiService.getHotelsWithSpecialOffers(hotelID, adults);
    }


}
