package com.techelevator.TakeOff.models.responses.flights;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.techelevator.TakeOff.models.responses.flights.FlightOffer;

import java.util.List;

public class FlightOfferData {
    public List<FlightOffer> getFlightOffers() {
        return flightOffers;
    }

    public void setFlightOffers(List<FlightOffer> newFlightOffers) {
        flightOffers = newFlightOffers;
    }

    @JsonProperty("data")
    public List<FlightOffer> flightOffers;
}

