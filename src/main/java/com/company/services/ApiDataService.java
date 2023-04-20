package com.company.services;


import com.company.model.JWT;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.JsonNode;
import org.apache.commons.codec.binary.Base64;

import java.nio.charset.Charset;

public class ApiDataService {
    public static String API_AUTH_URL = "https://test.api.amadeus.com/v1/security/oauth2/token";
    public static String API_CLIENT_ID = "segAQY78SxIY5wcNSDsj1ADuLQ2IvvgD";
    public static String API_CLIENT_SECRET = "SQTS5J8SBblkgvqG";
    public static String API_ACCESS_TOKEN;//Expires every 30 min
    private RestTemplate restTemplate = new RestTemplate();

    public String getAuthorization() {
        return restTemplate.getForObject("https://test.api.amadeus.com/v1/security/oauth2/token/" + API_ACCESS_TOKEN, String.class);
    }

    public String getCityList(String keyword) {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(API_ACCESS_TOKEN);
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        String url = "https://test.api.amadeus.com/v1/reference-data/locations?subType=AIRPORT,CITY&keyword=" + keyword
                + "&page[limit]=5";
        String body = restTemplate.exchange(url, HttpMethod.GET, entity, String.class).getBody();
        return body;
    }

    public void fetchAuthToken() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        String auth = API_CLIENT_ID + ":" + API_CLIENT_SECRET;
        byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
        String authHeader = "Basic " + new String(encodedAuth);
        headers.set("Authorization", authHeader);

        MultiValueMap<String, String> map= new LinkedMultiValueMap<>();
        map.add("grant_type", "client_credentials");
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);


        ResponseEntity<JWT> response = restTemplate.exchange(API_AUTH_URL, HttpMethod.POST, request, JWT.class);

        API_ACCESS_TOKEN=response.getBody().getAccessToken();
    }
}

/*
curl "https://test.api.amadeus.com/v1/security/oauth2/token" \
     -H "Content-Type: application/x-www-form-urlencoded" \
     -d "grant_type=client_credentials&client_id=segAQY78SxIY5wcNSDsj1ADuLQ2IvvgD&client_secret=SQTS5J8SBblkgvqG"
 */