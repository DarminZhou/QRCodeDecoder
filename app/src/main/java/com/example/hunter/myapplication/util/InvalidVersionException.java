package com.example.hunter.myapplication.util;

/**
 * Created by hunter on 13.06.15.
 */
public class InvalidVersionException extends VersionInformationException {
    String message;
    public InvalidVersionException(String message ) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}