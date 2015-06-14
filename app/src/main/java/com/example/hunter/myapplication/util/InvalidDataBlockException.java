package com.example.hunter.myapplication.util;

/**
 * Created by hunter on 13.06.15.
 */
public class InvalidDataBlockException extends IllegalArgumentException {
    String message = null;
    public InvalidDataBlockException(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}