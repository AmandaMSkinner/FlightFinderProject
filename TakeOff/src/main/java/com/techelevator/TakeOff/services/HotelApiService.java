/*
Added to App 4/21/23 by AS
*/

package com.techelevator.TakeOff.services;

import com.techelevator.TakeOff.models.responses.hotels.*;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HotelApiService extends ApiBaseService {

    public List<Hotel> getHotelsByCity(String city) {
        HttpEntity<String> entity = new HttpEntity<String>(getHeadersWithAuth());
        String url = "https://test.api.amadeus.com/v1/reference-data/locations/hotels/by-city?cityCode=" + city;
        ResponseEntity<HotelData> response = restTemplate.exchange(url, HttpMethod.GET, entity, HotelData.class);
        return response.getBody().getHotels();
    }


    public List<Hotel> getHotelsAutoComplete(String keyword, String subType) {
        HttpEntity<String> entity = new HttpEntity<String>(getHeadersWithAuth());
        String url = "https://test.api.amadeus.com/v1/reference-data/locations/hotel?keyword={keyword}&subType={subType}";
        ResponseEntity<HotelData> response = restTemplate.exchange(url, HttpMethod.GET, entity, HotelData.class, keyword, subType);
        return response.getBody().getHotels();
    }

    public List<Hotel> getHotelsByCityAndStars(String city, String stars) {
        HttpEntity<String> entity = new HttpEntity<String>(getHeadersWithAuth());

        String part1 = "https://test.api.amadeus.com/v1/reference-data/locations/hotels/by-city?ratings=" + stars;

        String part2 = "&cityCode=" + city;

        ResponseEntity<HotelData> response =
                restTemplate.exchange(part1 + part2, HttpMethod.GET, entity, HotelData.class);
        return response.getBody().getHotels();
    }

    public List<HotelOffer> getHotelOffers(String hotelIds, String adults, String checkIn, String checkOut) {
        HttpEntity<String> entity = new HttpEntity<String>(getHeadersWithAuth());

        String url = "https://test.api.amadeus.com/v3/shopping/hotel-offers?hotelIds={hotelIds}&adults={adults}&checkInDate={checkInDate}&checkOutDate={checkOutDate}";

        ResponseEntity<HotelOffers> response =
                restTemplate.exchange(url,
                        HttpMethod.GET, entity, HotelOffers.class, hotelIds, adults, checkIn, checkOut);
        return response.getBody().getHotelOffers();
    }

    public OfferData getOfferData(String offerId) {

        HttpEntity<String> entity = new HttpEntity<String>(getHeadersWithAuth());

        String url = "https://test.api.amadeus.com/v3/shopping/hotel-offers/{offerId}";

        ResponseEntity<OfferDetails> response =
                restTemplate.exchange(url, HttpMethod.GET, entity, OfferDetails.class, offerId);
        return response.getBody().getOfferData();
    }

//    public void bookHotel () {
//        // a person object / something may need to get passed to this
//        HttpEntity<String> entity = new HttpEntity<String>(getHeadersWithAuth());
//        String url = "https://test.api.amadeus.com/v1/booking/hotel-bookings";
//        ResponseEntity<HotelData> response =
//                restTemplate.exchange(url,HttpMethod.POST,entity,);
//
//    }


}
