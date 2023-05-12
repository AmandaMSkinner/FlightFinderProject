package com.techelevator.TakeOff.models.responses.hotels;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class HotelData {
    @JsonProperty("data")
    private List<Hotel> hotels;
    private Meta meta;

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Meta getMeta() {
        return meta;
    }
}
