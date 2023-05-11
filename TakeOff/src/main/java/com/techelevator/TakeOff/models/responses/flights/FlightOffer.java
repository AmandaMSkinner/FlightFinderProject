package com.techelevator.TakeOff.models.responses.flights;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;

public class FlightOffer {
    private String id;
    private String source;
    private boolean instantTicketingRequired;
    private boolean nonHomogenous;
    private boolean oneWay;
    private String lastTicketingDate;
    private String lastTicketingDateTime;
    private int numberOfBookableSeats;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public boolean isInstantTicketingRequired() {
        return instantTicketingRequired;
    }

    public void setInstantTicketingRequired(boolean instantTicketingRequired) {
        this.instantTicketingRequired = instantTicketingRequired;
    }

    public boolean isNonHomogenous() {
        return nonHomogenous;
    }

    public void setNonHomogenous(boolean nonHomogenous) {
        this.nonHomogenous = nonHomogenous;
    }

    public boolean isOneWay() {
        return oneWay;
    }

    public void setOneWay(boolean oneWay) {
        this.oneWay = oneWay;
    }

    public String getLastTicketingDate() {
        return lastTicketingDate;
    }

    public void setLastTicketingDate(String lastTicketingDate) {
        this.lastTicketingDate = lastTicketingDate;
    }

    public String getLastTicketingDateTime() {
        return lastTicketingDateTime;
    }

    public void setLastTicketingDateTime(String lastTicketingDateTime) {
        this.lastTicketingDateTime = lastTicketingDateTime;
    }

    public int getNumberOfBookableSeats() {
        return numberOfBookableSeats;
    }

    public void setNumberOfBookableSeats(int numberOfBookableSeats) {
        this.numberOfBookableSeats = numberOfBookableSeats;
    }

    /* "type": "flight-offer",
            "id": "1",
            "source": "GDS",
            "instantTicketingRequired": false,
            "nonHomogeneous": false,
            "oneWay": false,
            "lastTicketingDate": "2023-05-04",
            "lastTicketingDateTime": "2023-05-04",
            "numberOfBookableSeats": 9,*/
}
