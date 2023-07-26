/*Created by AS on 5/2/23
 */

package com.techelevator.TakeOff.services;

import com.techelevator.TakeOff.models.responses.flightinfo.FlightOffer;
import com.techelevator.TakeOff.models.responses.flights.FlightOfferData;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class FlightApiService extends com.techelevator.TakeOff.services.ApiBaseService {

    public List<FlightOffer> flightOffersSearch(String originLocationCode, String destinationLocationCode, String departureDate, String returnDate, Integer adults){
        HttpEntity<String> entity = new HttpEntity<String>(getHeadersWithAuth());

        Map<String,String> queryParams = new HashMap<>();
        //Updated to handle proper params and tested in postman//
        queryParams.put("originLocationCode", originLocationCode);
        queryParams.put("destinationLocationCode", destinationLocationCode);
        queryParams.put("departureDate", departureDate);
        queryParams.put("returnDate", returnDate);
        queryParams.put("adults", adults.toString());

        String url = "https://test.api.amadeus.com/v2/shopping/flight-offers?originLocationCode="+originLocationCode +
                "&destinationLocationCode="+destinationLocationCode +
                "&departureDate="+departureDate +
                "&returnDate="+returnDate+
                "&adults="+adults;

        ResponseEntity<FlightOfferData> response = restTemplate.exchange(url, HttpMethod.GET, entity, FlightOfferData.class, queryParams);
        return response.getBody().getData();
    }

}
