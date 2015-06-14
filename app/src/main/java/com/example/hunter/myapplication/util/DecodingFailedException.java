package com.example.hunter.myapplication.util;

/**
 * Created by hunter on 13.06.15.
 */
public class DecodingFailedException extends IllegalArgumentException {
    String message = null;
    public DecodingFailedException(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}