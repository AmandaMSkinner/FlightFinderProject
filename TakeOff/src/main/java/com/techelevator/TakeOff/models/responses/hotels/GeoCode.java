/*
Added to App 4/21/23 by AS
*/
package com.techelevator.TakeOff.models.responses.hotels;

public class GeoCode {
    private Object latitude;
    private Object longitude;

    public void setLatitude(Object latitude) {
        this.latitude = latitude;
    }

    public Object getLatitude() {
        return latitude;
    }

    public void setLongitude(Object longitude) {
        this.longitude = longitude;
    }

    public Object getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return
                "GeoCode{" +
                        "latitude = '" + latitude + '\'' +
                        ",longitude = '" + longitude + '\'' +
                        "}";
    }
}
