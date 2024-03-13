package org.fizzbuzz.fr.exception;

public class DivisibleByZeroException extends RuntimeException {
    public DivisibleByZeroException(String message) {
        super(message);
    }
}

