/*
Added to App 4/21/23 by AS
*/
package com.techelevator.TakeOff.models.responses;

public class Hotel {
    private String iataCode;
    private Address address;
    private String chainCode;
    private int dupeId;
    private String name;
    private GeoCode geoCode;
    private String hotelId;

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setChainCode(String chainCode) {
        this.chainCode = chainCode;
    }

    public String getChainCode() {
        return chainCode;
    }

    public void setDupeId(int dupeId) {
        this.dupeId = dupeId;
    }

    public int getDupeId() {
        return dupeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGeoCode(GeoCode geoCode) {
        this.geoCode = geoCode;
    }

    public GeoCode getGeoCode() {
        return geoCode;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelId() {
        return hotelId;
    }

    @Override
    public String toString() {
        return
                "Hotel{" +
                        "iataCode = '" + iataCode + '\'' +
                        ",address = '" + address + '\'' +
                        ",chainCode = '" + chainCode + '\'' +
                        ",dupeId = '" + dupeId + '\'' +
                        ",name = '" + name + '\'' +
                        ",geoCode = '" + geoCode + '\'' +
                        ",hotelId = '" + hotelId + '\'' +
                        "}";
    }
}
