package com.pharmacy.pharmacy_API.Model;

public class AuthenticationResponse {


    private final String jwt;
    private  String statusCode;
    private String validationMessage;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getValidationMessage() {
        return validationMessage;
    }

    public void setValidationMessage(String validationMessage) {
        this.validationMessage = validationMessage;
    }



    public AuthenticationResponse(String jwt,String code,String validationMessage) {
        this.jwt = jwt;
        this.statusCode=code;
        this.validationMessage=validationMessage;
    }

    public String getJwt() {
        return jwt;
    }
}