/*
Created 5/2/23 by AS*/

package com.techelevator.Takeoff.controllers;

import com.techelevator.Takeoff.models.responses.flightinfo.FlightOffer;
import com.techelevator.Takeoff.services.FlightApiService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    private FlightApiService flightApiService;

    public FlightController(FlightApiService flightApiService) {
        this.flightApiService = flightApiService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<FlightOffer>> getFlightOffersBySearch(
<<<<<<< HEAD
            @RequestParam(defaultValue = "") String originLocationCode,
            @RequestParam(defaultValue = "") String destinationLocationCode,
            @RequestParam(defaultValue = "") String departureDate,
            @RequestParam(defaultValue = "") String returnDate,
            @RequestParam(defaultValue = "") int adults,
            @RequestParam(defaultValue = "") int max
=======
            @RequestParam(defaultValue = "SYD") String originLocationCode,
            @RequestParam(defaultValue = "LAX") String destinationLocationCode,
            @RequestParam(defaultValue = "2023-12-21") String departureDate,
            @RequestParam(defaultValue = "2023-12-25") String returnDate, //If not entered will be a one way trip
            @RequestParam(defaultValue = "1") int adults, //Assume 1 person
            @RequestParam(defaultValue = "5") int max
>>>>>>> 6f4be45c11670910f0263781102ac0f0d5562dd3

    ) {
        return new ResponseEntity<>(flightApiService.flightOffersSearch(originLocationCode, destinationLocationCode,
                departureDate, returnDate, adults, max), HttpStatus.OK);
    }
<<<<<<< HEAD
=======

    @RestController
    @RequestMapping("/flights/prices")
    public class FlightPriceController {
        private FlightApiService flightApiService;

        public FlightPriceController(FlightApiService flightApiService) {
            this.flightApiService = flightApiService;
        }

        @RequestMapping(method = RequestMethod.POST)
        public String getFlightPrices() {
            return "Placeholder message";
        }
    }
>>>>>>> 6f4be45c11670910f0263781102ac0f0d5562dd3
}
