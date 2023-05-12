package com.techelevator.TakeOff.models.responses.hotels;

import java.util.List;

public class CustomerData {
    private List<RoomsItem> rooms;
    private List<PaymentsItem> payments;
    private List<GuestsItem> guests;
    private String offerId;

    public void setRooms(List<RoomsItem> rooms) {
        this.rooms = rooms;
    }

    public List<RoomsItem> getRooms() {
        return rooms;
    }

    public void setPayments(List<PaymentsItem> payments) {
        this.payments = payments;
    }

    public List<PaymentsItem> getPayments() {
        return payments;
    }

    public void setGuests(List<GuestsItem> guests) {
        this.guests = guests;
    }

    public List<GuestsItem> getGuests() {
        return guests;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getOfferId() {
        return offerId;
    }
}