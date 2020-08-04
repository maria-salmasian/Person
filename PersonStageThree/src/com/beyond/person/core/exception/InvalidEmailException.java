package com.beyond.person.core.exception;

public class InvalidEmailException extends RuntimeException {
    public InvalidEmailException() {
        super("Email not found!");
    }
}
