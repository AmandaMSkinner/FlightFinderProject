/*
Added to App 4/21/23 by AS
*/

package com.techelevator.TakeOff.services;

import com.techelevator.TakeOff.models.responses.hotels.Hotel;
import com.techelevator.TakeOff.models.responses.hotels.HotelData;
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


    public List<Hotel> getHotelsWithSpecialOffers(int hotelId, int adults) {

        HttpEntity<String> entity = new HttpEntity<String>(getHeadersWithAuth());
        String urlPart1 = "https://test.api.amadeus.com/v3/shopping/hotel-offers?hotelIds=";
        String urlPart2 = "&adults=";
        ResponseEntity<HotelData> response =
                restTemplate.exchange(urlPart1 + hotelId + urlPart2 + adults,
                        HttpMethod.GET,
                        entity,
                        HotelData.class);
        return response.getBody().getHotels();

    }

    public List<Hotel> getHotelsAutoComplete(String keyword, String subType) {
        HttpEntity<String> entity = new HttpEntity<String>(getHeadersWithAuth());
        String url = "https://test.api.amadeus.com/v1/reference-data/locations/hotel?keyword={keyword}&subType={subType}";
        ResponseEntity<HotelData> response = restTemplate.exchange(url, HttpMethod.GET, entity, HotelData.class, keyword, subType);
        return response.getBody().getHotels();
    }


}
