package com.techelevator.TakeOff.controllers;

import com.techelevator.TakeOff.models.responses.hotels.Hotel;
import com.techelevator.TakeOff.models.responses.hotels.HotelOffer;
import com.techelevator.TakeOff.models.responses.hotels.OfferData;
import com.techelevator.TakeOff.services.HotelApiService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

        if (!city.isEmpty() && !stars.isEmpty()) {
            return new ResponseEntity<>(hotelApiService.getHotelsByCityAndStars(city, stars), HttpStatus.OK);
        }

        if (!city.isEmpty()) {
            return new ResponseEntity<>(hotelApiService.getHotelsByCity(city), HttpStatus.OK);
        }

        if (!keyword.isEmpty() && !subType.isEmpty()) {
            return new ResponseEntity<>(hotelApiService.getHotelsAutoComplete(keyword, subType), HttpStatus.OK);
        }

        return new ResponseEntity(HttpStatus.BAD_REQUEST);


    }


    @RequestMapping(path = "/offers", method = RequestMethod.GET)
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
        //List<HotelOffer> offuhs = hotelApiService.getHotelOffers(hotelID,adults,checkIn,checkOut);
        return new ResponseEntity(hotelApiService.getHotelOffers(hotelID, adults, checkIn, checkOut), HttpStatus.OK);

    }

    @RequestMapping(path = "/offerDetails/{offerId}", method = RequestMethod.GET)
    public ResponseEntity<OfferData> getOfferDetails
            (@PathVariable String offerId) {

        return new ResponseEntity(hotelApiService.getOfferData(offerId), HttpStatus.OK);

    }

//    @RequestMapping(path = "/BookRoom", method = RequestMethod.POST)
//    public void bookRoom(
//            @RequestBody @Valid //Whatever gets passed to this method
//            ) {
//        hotelApiService.bookHotel();
//    }

}
