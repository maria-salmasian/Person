package com.beyond.person.core.exception;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException() {
        super("invalid age!");
    }
}
