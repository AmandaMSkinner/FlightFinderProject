/*
Added to App 4/21/23 by AS
*/

package com.techelevator.takeoff.services;

import com.techelevator.takeoff.models.responses.JWT;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.time.LocalDateTime;

public class ApiBaseService {

    private static String API_AUTH_URL = "https://test.api.amadeus.com/v1/security/oauth2/token";
    private static String API_CLIENT_ID = "segAQY78SxIY5wcNSDsj1ADuLQ2IvvgD";
    private static String API_CLIENT_SECRET = "SQTS5J8SBblkgvqG";
    private static String API_ACCESS_TOKEN = "";//Expires every 30 min
    private static LocalDateTime API_ACCESS_TOKEN_EXPIRATION = LocalDateTime.MIN;
    protected static RestTemplate restTemplate = new RestTemplate();


    private static void fetchAuthToken() {
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
        API_ACCESS_TOKEN_EXPIRATION = LocalDateTime.now().plusSeconds(response.getBody().getExpiresIn() - 5);
        API_ACCESS_TOKEN = response.getBody().getAccessToken();
    }

    private static void validateAccessToken() {
        if (API_ACCESS_TOKEN_EXPIRATION.isBefore(LocalDateTime.now()) ||
                API_ACCESS_TOKEN.isEmpty()) {
            fetchAuthToken();
        }
    }
    protected static HttpHeaders getHeadersWithAuth() {
        validateAccessToken();
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(API_ACCESS_TOKEN);
        return headers;
    }
}
