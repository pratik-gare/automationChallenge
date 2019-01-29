package com.sh.model;

public class SupplierInfo {
    private final String supplierId;
    private final String productId;
    private final long quantity;

    public SupplierInfo(String supplierId, String productId, long quantity) {
        this.productId = productId;
        this.supplierId = supplierId;
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public long getQuantity() {
        return quantity;
    }

    public String getSupplierId() {
        return supplierId;
    }
}
