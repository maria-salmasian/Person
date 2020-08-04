package com.beyond.person.core.exception;

public class InvalidTypeException extends RuntimeException {
    public InvalidTypeException() {
        super("Type not supported");

    }
}
