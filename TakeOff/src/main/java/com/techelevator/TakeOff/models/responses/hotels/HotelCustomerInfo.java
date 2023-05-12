package com.techelevator.TakeOff.models.responses.hotels;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HotelCustomerInfo {
    @JsonProperty("data")
    private CustomerData customerData;

    public void setCustomerData(CustomerData customerData) {
        this.customerData = customerData;
    }

    public CustomerData getCustomerData() {
        return customerData;
    }
}
