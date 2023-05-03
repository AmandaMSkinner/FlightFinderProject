/*Created by AS on 5/2/23
 */

package com.techelevator.takeoff.services;

import com.techelevator.takeoff.models.responses.FlightOffer;
import com.techelevator.takeoff.models.responses.FlightOfferData;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FlightApiService extends ApiBaseService{

    public List<FlightOffer> flightOffersSearch(String originLocationCode, String destinationLocationCode, String departureDate, String returnDate, int adults, int max){
        HttpEntity<String> entity = new HttpEntity<String>(getHeadersWithAuth());
        String url = "https://test.api.amadeus.com/v2/shopping/flight-offers?originLocationCode="+originLocationCode +
                "&destinationLocationCode="+destinationLocationCode +
                "&departureDate="+departureDate +
                "&returnDate="+returnDate+
                "&adults="+adults +
                "&max="+max;
        ResponseEntity<FlightOfferData> response = restTemplate.exchange(url, HttpMethod.GET, entity, FlightOfferData.class);
        return response.getBody().getFlightOffers();
    }
}
