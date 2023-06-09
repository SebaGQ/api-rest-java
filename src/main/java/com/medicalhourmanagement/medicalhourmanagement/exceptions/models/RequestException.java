package com.medicalhourmanagement.medicalhourmanagement.exceptions.models;

import lombok.Data;

@Data
public class RequestException extends RuntimeException{

    private String code;
    private String message;
    public RequestException(String message) {
        this.message = message;
    }

}
