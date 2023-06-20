/*
Added to App 4/21/23 by AS
*/

package com.techelevator.TakeOff.models.responses.flightinfo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JWT {
    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("application_name")
    private String applicationName;
    private String scope;
    private String state;
    private String type;
    @JsonProperty("token_type")
    private String tokenType;
    @JsonProperty("expires_in")
    private int expiresIn;
    @JsonProperty("client_id")
    private String clientId;
    private String username;

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getScope() {
        return scope;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return
                "JWT{" +
                        "access_token = '" + accessToken + '\'' +
                        ",application_name = '" + applicationName + '\'' +
                        ",scope = '" + scope + '\'' +
                        ",state = '" + state + '\'' +
                        ",type = '" + type + '\'' +
                        ",token_type = '" + tokenType + '\'' +
                        ",expires_in = '" + expiresIn + '\'' +
                        ",client_id = '" + clientId + '\'' +
                        ",username = '" + username + '\'' +
                        "}";
    }
}
