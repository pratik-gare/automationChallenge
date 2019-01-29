package com.sh.exception;

public class MetadataNotFoundException extends RuntimeException {
    public MetadataNotFoundException(String message) {
        super(message);
    }
}
