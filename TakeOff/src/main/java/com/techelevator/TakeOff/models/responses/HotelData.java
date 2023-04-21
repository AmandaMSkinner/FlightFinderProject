/*
Added to App 4/21/23 by AS
*/
package com.techelevator.TakeOff.models.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

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
