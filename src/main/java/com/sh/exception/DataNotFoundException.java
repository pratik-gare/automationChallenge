package com.sh.exception;

public class DataNotFoundException extends RuntimeException {
    public DataNotFoundException(String no_metadata_found) {
        super(no_metadata_found);
    }
}
