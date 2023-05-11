/*
Added to App 4/21/23 by AS
*/
package com.techelevator.TakeOff.models.responses.hotels;

public class Address {
    private String countryCode;

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    @Override
    public String toString() {
        return
                "Address{" +
                        "countryCode = '" + countryCode + '\'' +
                        "}";
    }
}
