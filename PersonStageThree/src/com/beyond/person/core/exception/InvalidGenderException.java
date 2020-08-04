package com.beyond.person.core.exception;

public class InvalidGenderException extends RuntimeException {
    public InvalidGenderException() {
        super("Gender not found!");
    }
}
