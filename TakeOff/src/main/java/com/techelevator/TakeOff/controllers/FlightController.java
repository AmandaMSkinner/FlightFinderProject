/*
Created 5/2/23 by AS*/

package com.techelevator.TakeOff.controllers;

import com.techelevator.TakeOff.models.responses.flightinfo.FlightOffer;
import com.techelevator.TakeOff.services.FlightApiService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    private FlightApiService flightApiService;

    public FlightController(FlightApiService flightApiService) {
        this.flightApiService = flightApiService;
    }

    /*
      This is where our program can take information from the frontend and pass it through AMADEUS to get
      flight info.  For demo purposes, I have put in default parameters.  These will be replaced with "" for final project
      -AS 6-20-23

      To Verify:  GET http://localhost:8080/flights in Postman.
    */

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<FlightOffer>> getFlightOffersBySearch(
            @RequestParam(defaultValue = "SYD") String originLocationCode,
            @RequestParam(defaultValue = "LAX") String destinationLocationCode,
            @RequestParam(defaultValue = "2023-12-24") String departureDate,
            @RequestParam(defaultValue = "2023-12-31") String returnDate,
            @RequestParam(defaultValue = "3") Integer adults,
            @RequestParam(defaultValue = "5") Integer max

    )
    {
        return new ResponseEntity<>(flightApiService.flightOffersSearch(originLocationCode, destinationLocationCode,
                departureDate, returnDate, adults, max), HttpStatus.OK);
    }

}
