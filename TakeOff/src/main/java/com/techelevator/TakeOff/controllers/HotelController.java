package com.techelevator.TakeOff.controllers;

import com.techelevator.TakeOff.models.combination.HotelAndOffers;
import com.techelevator.TakeOff.models.responses.hotels.*;
import com.techelevator.TakeOff.services.HotelApiService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/hotels")
@CrossOrigin
public class HotelController {

    private HotelApiService hotelApiService;

    public HotelController(HotelApiService hotelApiService) {
        this.hotelApiService = hotelApiService;
    }

    /*
    This is where our program can take information from the frontend and pass it through AMADEUS to get
    hotel info.  For demo purposes, I have put in default parameters.  These will be replaced with "" for final project
    -AS 6-20-23

    To verify, GET http://localhost:8080/hotels in Postman
    */

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Hotel>> getHotelsByCity(
            @RequestParam(defaultValue = "DEL") String city,
            @RequestParam(defaultValue = "") String stars,
            @RequestParam(defaultValue = "") String amenities) {

        if (city.isEmpty()) {
            return new ResponseEntity("Request parameter city is missing.", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(hotelApiService.getHotelsByCity(city, stars, amenities), HttpStatus.OK);
    }

    /*
    This is where our program can take information from the results of the primary hotel search and pass it through AMADEUS to get
    offer info.  For demo purposes, I have put in default parameters.  These will be replaced with "" for final project

    NOTE:  Even the examples provided in the Amadeus for Postman workspace return an empty set for the offers search.
    We should ask for help in determining whether we can get results to display without paying for full API access.
    -AS 6-20-23

    To verify, GET http://localhost:8080/hotels/offers in Postman
    */

    @GetMapping(path = "/offers")
    public ResponseEntity<List<HotelOffer>> getHotelOffers
            (@RequestParam(defaultValue = "BWDEL538") String hotelID,
             @RequestParam(defaultValue = "1") String adults,
             @RequestParam() String checkIn,
             @RequestParam() String checkOut) {
        String errorResponse = "";
        if (hotelID.isEmpty()) {
            errorResponse += "Hotel ID parameter is empty";
        }
        if (checkIn.isEmpty()) {
            errorResponse += "CheckIn parameter is empty";
        }
        if (checkIn.isEmpty()) {
            errorResponse += "CheckOut parameter is empty";
        }
        if (!errorResponse.isEmpty()) {
            return new ResponseEntity(errorResponse, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(hotelApiService.getHotelOffers(hotelID, adults, checkIn, checkOut), HttpStatus.OK);
    }

    @GetMapping(path = "/offerDetails/{offerId}")
    public ResponseEntity<OfferData> getOfferDetails
            (@PathVariable String offerId) {
        return new ResponseEntity(hotelApiService.getOfferData(offerId), HttpStatus.OK);

    }


    @PostMapping(path = "/bookRooms")
    public ResponseEntity<List<BookingData>> bookRoom(
            @RequestBody @Valid CustomerDataParent customerData) {
        return new ResponseEntity(hotelApiService.bookHotel(customerData), HttpStatus.OK);
    }


    @GetMapping(path = "/hotelsAndOffers")
    public ResponseEntity<List<HotelAndOffers>> getHotelsAndOffers(
             @RequestParam(defaultValue = "Jacksonville") String city,
             @RequestParam(defaultValue = "1") String adults,
             @RequestParam() String checkIn,
             @RequestParam() String checkOut
    ) {
        return new ResponseEntity<>(hotelApiService.getHotelsAndTheirOffers(city,adults,checkIn,checkOut),HttpStatus.OK);

    }

}
