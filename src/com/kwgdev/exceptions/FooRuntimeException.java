package com.kwgdev.exceptions;

// define our own Exception within the class
// rarely would you want to define your own exceptions, but when you do
// they should be defined in their own package - NOT within the same class that calls it
public class FooRuntimeException extends Exception {
    public FooRuntimeException(String message) {
        super(message);
    }
}