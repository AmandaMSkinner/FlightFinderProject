package com.techelevator.takeoff.controllers;

import com.techelevator.takeoff.models.responses.Hotel;
import com.techelevator.takeoff.services.HotelApiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("hotels")
public class HotelController {

    private HotelApiService hotelApiService;

    public HotelController(HotelApiService hotelApiService) {
        this.hotelApiService = hotelApiService;
    }

    @RequestMapping("/")
    public List<Hotel> getHotelsByCity(@RequestParam String city) {
        // Save each search being done
        List<Hotel> data = hotelApiService.getHotelsByCity(city);
        for (Hotel hotel : data) {
            hotel.setName("bob");
        }
        return data;
    }


}
