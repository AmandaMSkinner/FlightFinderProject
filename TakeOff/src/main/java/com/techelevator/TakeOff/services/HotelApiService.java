/*
Added to App 4/21/23 by AS
*/

package com.techelevator.takeoff.services;

import com.techelevator.takeoff.models.responses.Hotel;
import com.techelevator.takeoff.models.responses.HotelData;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Component
public class HotelApiService extends ApiBaseService {

    public List<Hotel> getHotelsByCity(String city) {
        HttpEntity<String> entity = new HttpEntity<String>(getHeadersWithAuth());
        String url = "https://test.api.amadeus.com/v1/reference-data/locations/hotels/by-city?cityCode=" + city;
        ResponseEntity<HotelData> response = restTemplate.exchange(url, HttpMethod.GET, entity, HotelData.class);
        return response.getBody().getHotels();
    }


}
