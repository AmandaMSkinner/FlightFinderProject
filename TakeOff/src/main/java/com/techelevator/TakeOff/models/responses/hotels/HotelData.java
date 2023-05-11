/*
Added to App 4/21/23 by AS
*/
package com.techelevator.TakeOff.models.responses.hotels;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.techelevator.TakeOff.models.responses.hotels.Hotel;

import java.util.List;

public class HotelData {
    public List<Hotel> getHotels() {
        return Hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        Hotels = hotels;
    }

    @JsonProperty("data")
    public List<Hotel> Hotels;
}
