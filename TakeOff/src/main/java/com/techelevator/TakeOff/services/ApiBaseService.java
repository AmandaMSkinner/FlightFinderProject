/*
Added to App 4/21/23 by AS
*/

package com.techelevator.TakeOff.services;

import com.techelevator.TakeOff.models.responses.JWT;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.apache.commons.codec.binary.Base64;

import java.nio.charset.Charset;

public class ApiBaseService {

    private static String API_AUTH_URL = "https://test.api.amadeus.com/v1/security/oauth2/token";
    private static String API_CLIENT_ID = "segAQY78SxIY5wcNSDsj1ADuLQ2IvvgD";
    private static String API_CLIENT_SECRET = "SQTS5J8SBblkgvqG";
    private static String API_ACCESS_TOKEN;//Expires every 30 min
    protected RestTemplate restTemplate = new RestTemplate();


    public void fetchAuthToken() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        String auth = API_CLIENT_ID + ":" + API_CLIENT_SECRET;
        byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
        String authHeader = "Basic " + new String(encodedAuth);
        headers.set("Authorization", authHeader);

        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("grant_type", "client_credentials");
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);


        ResponseEntity<JWT> response = restTemplate.exchange(API_AUTH_URL, HttpMethod.POST, request, JWT.class);

        API_ACCESS_TOKEN = response.getBody().getAccessToken();
    }

    protected HttpHeaders getHeadersWithAuth() {

        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(API_ACCESS_TOKEN);
        return headers;


    }


}
