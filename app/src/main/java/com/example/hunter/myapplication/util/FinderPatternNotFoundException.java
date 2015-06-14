package com.example.hunter.myapplication.util;

/**
 * Created by hunter on 13.06.15.
 */
public class FinderPatternNotFoundException extends Exception {
    String message = null;
    public FinderPatternNotFoundException(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}