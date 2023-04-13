package com.company.services;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

public class ApiDataService {
    public static String API_AUTH_URL = "https://test.api.amadeus.com/v1/security/oauth2/token";
    public static String API_CLIENT_ID = "segAQY78SxIY5wcNSDsj1ADuLQ2IvvgD";
    public static String API_CLIENT_SECRET = "SQTS5J8SBblkgvqG";
    public static String API_ACCESS_TOKEN = "wGZpR7JzBuFFv92yzgyi1vThVTNb";//Expires every 30 min
    private RestTemplate restTemplate = new RestTemplate();

    public String getAuthorization() {

        return restTemplate.getForObject("https://test.api.amadeus.com/v1/security/oauth2/token/" + API_ACCESS_TOKEN, String.class);
    }

    public String getCityList(String keyword){
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(API_ACCESS_TOKEN);
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        String url = "https://test.api.amadeus.com/v1/reference-data/locations?subType=AIRPORT,CITY&keyword=" + keyword
                + "&page[limit]=5";
        String body = restTemplate.exchange(url, HttpMethod.GET, entity, String.class).getBody();
        return body;
    }
}

/*
curl "https://test.api.amadeus.com/v1/security/oauth2/token" \
     -H "Content-Type: application/x-www-form-urlencoded" \
     -d "grant_type=client_credentials&client_id=segAQY78SxIY5wcNSDsj1ADuLQ2IvvgD&client_secret=SQTS5J8SBblkgvqG"
 */