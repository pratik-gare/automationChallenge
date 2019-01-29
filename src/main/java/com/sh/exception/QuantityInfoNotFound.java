package com.sh.exception;

public class QuantityInfoNotFound extends RuntimeException {
    public QuantityInfoNotFound(String no_info_regarding_quantity_found) {
        super(no_info_regarding_quantity_found);
    }
}
