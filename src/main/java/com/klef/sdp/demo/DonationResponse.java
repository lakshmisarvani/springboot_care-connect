package com.klef.sdp.demo;

public class DonationResponse {

    private String status;
    private String message;
    private String sessionUrl;

    // Default constructor for Spring to use
    public DonationResponse() {}

    // Constructor for Success response
    public DonationResponse(String status, String sessionUrl) {
        this.status = status;
        this.sessionUrl = sessionUrl;
    }

    // Constructor for Error response
    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSessionUrl() {
        return sessionUrl;
    }

    public void setSessionUrl(String sessionUrl) {
        this.sessionUrl = sessionUrl;
    }
}
