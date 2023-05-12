package com.techelevator.TakeOff.models.responses.hotels;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BookingConfirmation {
    @JsonProperty("data")
    private List<BookingData> bookingData;
    private List<WarningsItem> warnings;

    public void setBookingData(List<BookingData> bookingData) {
        this.bookingData = bookingData;
    }

    public List<BookingData> getBookingData() {
        return bookingData;
    }

    public void setWarnings(List<WarningsItem> warnings) {
        this.warnings = warnings;
    }

    public List<WarningsItem> getWarnings() {
        return warnings;
    }
}