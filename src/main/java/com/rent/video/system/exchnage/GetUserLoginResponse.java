package com.rent.video.system.exchnage;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetUserLoginResponse {
    String message;
    String jwtToken;
    public GetUserLoginResponse()
    {

    }

    public GetUserLoginResponse(String message, String jwtToken) {
        this.message = message;
        this.jwtToken = jwtToken;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }
}
