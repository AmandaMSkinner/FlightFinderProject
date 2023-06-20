/*Created by AS on 5/2/23
 */

package com.techelevator.TakeOff.services;

import com.techelevator.TakeOff.models.responses.flightinfo.FlightOffer;
import com.techelevator.TakeOff.models.responses.flights.FlightOfferData;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FlightApiService extends com.techelevator.TakeOff.services.ApiBaseService {

    public List<FlightOffer> flightOffersSearch(String originLocationCode, String destinationLocationCode, String departureDate, String returnDate, int adults, int max){
        HttpEntity<String> entity = new HttpEntity<String>(getHeadersWithAuth());
        String url = "https://test.api.amadeus.com/v2/shopping/flight-offers?originLocationCode="+originLocationCode +
                "&destinationLocationCode="+destinationLocationCode +
                "&departureDate="+departureDate +
                "&returnDate="+returnDate+
                "&adults="+adults+
                "&max="+max;
        ResponseEntity<FlightOfferData> response = restTemplate.exchange(url, HttpMethod.GET, entity, FlightOfferData.class);
        return response.getBody().getData();
    }

}
