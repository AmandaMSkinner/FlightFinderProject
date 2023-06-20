package com.techelevator.TakeOff.services;

import com.techelevator.TakeOff.models.responses.locations.Location;
import com.techelevator.TakeOff.models.responses.locations.LocationSearchResult;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CityService extends ApiBaseService {

    public List<Location> getLocationsByKeyword(String searchTerm) {

        HttpEntity<String> entity = new HttpEntity<String>(getHeadersWithAuth());
        String url = "https://test.api.amadeus.com/v1/reference-data/locations/cities?keyword="
                + searchTerm;
        ResponseEntity<LocationSearchResult> response = restTemplate.exchange
                (url, HttpMethod.GET,entity,LocationSearchResult.class);
        return response.getBody().getLocations();

    }
}
