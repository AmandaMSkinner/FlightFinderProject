package com.techelevator.TakeOff.models.combination;

import com.techelevator.TakeOff.models.responses.hotels.Hotel;
import com.techelevator.TakeOff.models.responses.hotels.HotelOffer;

import java.util.List;

public class HotelAndOffers {
    Hotel hotel;
    List<HotelOffer> hotelOffers;

    public HotelAndOffers(Hotel hotel, List<HotelOffer> hotelOffers) {
        this.hotel = hotel;
        this.hotelOffers = hotelOffers;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public List<HotelOffer> getHotelOffers() {
        return hotelOffers;
    }

    public void setHotelOffers(List<HotelOffer> hotelOffers) {
        this.hotelOffers = hotelOffers;
    }
}
