package com.company.services;

import com.company.model.responses.Hotel;
import com.company.model.responses.HotelData;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class HotelApiService extends ApiBaseService {


    public List<Hotel> getHotelsByCity(String city) {
        HttpEntity<String> entity = new HttpEntity<String>(getHeadersWithAuth());
        String url = "https://test.api.amadeus.com/v1/reference-data/locations/hotels/by-city?cityCode=" + city;
        ResponseEntity<HotelData> response = restTemplate.exchange(url, HttpMethod.GET, entity, HotelData.class);
        return response.getBody().getHotels();
    }


}
