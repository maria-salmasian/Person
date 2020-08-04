package com.beyond.person.core.exception;

public class InvalidFieldException extends RuntimeException {
    public InvalidFieldException() {
        super("String not accepted!");
    }
}
