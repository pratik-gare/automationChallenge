package com.sh.supplier;

/**
 * Information pertaining to the supplier
 * This class is immutable
 * These are all the fields that needs to be persisted
 * Using some ORM we can easily persist this object
 */
public class SupplierInfo {
    /**
     * id of the supplier
     */
    private final String supplierId;

    /**
     * id of the product
     */
    private final String productId;

    /**
     * product quantity
     */
    private final long quantity;


    // add more fields if you need to persist more things


    /**
     * @param supplierId id of the supplier
     * @param productId id of the product
     * @param quantity product quantity
     */
    public SupplierInfo(String supplierId, String productId, long quantity) {
        this.productId = productId;
        this.supplierId = supplierId;
        this.quantity = quantity;
    }

    /**
     * @return id of the product
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @return product quantity
     */
    public long getQuantity() {
        return quantity;
    }


    /**
     * @return id of the supplier
     */
    public String getSupplierId() {
        return supplierId;
    }
}
