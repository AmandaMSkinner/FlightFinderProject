package com.company.services;

import com.company.model.ApiData;
import org.springframework.web.client.RestTemplate;

public class ApiDataService {
    public static String API_BASE_URL = "https://developer.nps.gov/api/v1/parks";
    public static String API_KEY = "ZxjL0eqjhdM3pwzbtKCHnXMMmvLVa1RkXwOyv1mu";
    private RestTemplate restTemplate = new RestTemplate();

    public ApiData getApiData(String query) {
        try {
            String dataJSON = restTemplate.getForObject(API_BASE_URL + "?parkCode=" + query + "&api_key=" + API_KEY, String.class);
            ApiData apiData = new ApiData();
            System.out.println(dataJSON);
            return apiData;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
