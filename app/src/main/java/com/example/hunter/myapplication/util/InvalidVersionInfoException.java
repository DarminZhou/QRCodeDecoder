package com.example.hunter.myapplication.util;

/**
 * Created by hunter on 13.06.15.
 */
public class InvalidVersionInfoException extends VersionInformationException {
    String message = null;
    public InvalidVersionInfoException(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

}