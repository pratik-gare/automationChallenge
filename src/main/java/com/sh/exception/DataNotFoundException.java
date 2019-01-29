package com.sh.exception;


public class DataNotFoundException extends RuntimeException {
    public DataNotFoundException(String noMetadataFound) {
        super(noMetadataFound);
    }
}
