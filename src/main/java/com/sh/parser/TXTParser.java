package com.sh.parser;

import com.sh.supplier.SupplierInfo;

/**
 * Implementation of a Parser
 * Parses the data for text
 */
public class TXTParser implements Parser {
    /**
     * sets the product id index
     * @param columnNumber product id index
     */
    public void setProductIdIndex(int columnNumber) {

    }

    /**
     * sets the quantity index
     * @param columnNumber quantity index
     */
    public void setQuantityIndex(int columnNumber) {

    }

    /**
     * updates the product id index and the quantity index in the data
     * @param line data to be parsed
     * @param productKeyword keyword used to define product id in the metadata
     * @param quantityKeyword keyword used to define quantity in the metadata
     */
    public void updateMetadata(String line, String productKeyword, String quantityKeyword) {

    }

    /**
     * @param line data to be parsed
     * @param supplierId id of the supplier
     * @return supplierInfo information of the supplier
     */
    public SupplierInfo parse(String line, String supplierId) {
        return null;
    }
}
