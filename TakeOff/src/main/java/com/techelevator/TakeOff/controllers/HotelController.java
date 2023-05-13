package com.techelevator.TakeOff.controllers;

import com.techelevator.TakeOff.models.responses.hotels.*;
import com.techelevator.TakeOff.services.HotelApiService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
            @RequestParam(defaultValue = "") String stars,
            @RequestParam(defaultValue = "") String amenities) {

        if (city.isEmpty()) {
            return new ResponseEntity("Request parameter city is missing.", HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity(hotelApiService.getHotelsByCity(city, stars, amenities), HttpStatus.OK);
    }


    @GetMapping(path = "/offers")
    public ResponseEntity<List<HotelOffer>> getHotelOffers
            (@RequestParam(defaultValue = "") String hotelID,
             @RequestParam(defaultValue = "1") String adults,
             @RequestParam(defaultValue = "") String checkIn,
             @RequestParam(defaultValue = "") String checkOut) {
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

}
