package com.sh.parser;

import com.sh.exception.DataNotFoundException;
import com.sh.exception.MetadataNotFoundException;
import com.sh.exception.ProductIdInfoNotFoundException;
import com.sh.exception.QuantityInfoNotFound;
import com.sh.supplier.SupplierInfo;


/**
 * Implementation of a Parser
 * Parses the data for comma separated values
 */
public class CSVParser implements Parser {

    private int productIdIndex;
    private int quantityIdIndex;

    /**
     * Constructor
     * initialized the productIdIndex, quantityIdIndex
     */
    public CSVParser() {
        this.productIdIndex = -1;
        this.quantityIdIndex = -1;
    }

    /**
     * sets the product id index
     * @param columnNumber product id index
     */
    public void setProductIdIndex(int columnNumber) {
        this.productIdIndex = columnNumber;
    }

    /**
     * sets the quantity index
     * @param columnNumber quantity index
     */
    public void setQuantityIndex(int columnNumber) {
        this.quantityIdIndex = columnNumber;
    }

    /**
     * updates the product id index and the quantity index in the data
     * @param line data to be parsed
     * @param productKeyword keyword used to define product id in the metadata
     * @param quantityKeyword keyword used to define quantity in the metadata
     */
    public void updateMetadata(String line, String productKeyword, String quantityKeyword) {
        if (line == null || line.length() == 0) {
            throw new MetadataNotFoundException("No metadata found");
        }
        String[] metadata = line.split("\\s+,\\s+");
        //add more exceptions accordingly
        for (int index = 0; index<metadata.length; index++) {
            if (metadata[index].equals(productKeyword)) {
                this.productIdIndex = index;
            } else if (metadata[index].equals(quantityKeyword)) {
                this.quantityIdIndex = index;
            }
        }
        if (productIdIndex == -1 || quantityIdIndex == -1) {
            throw new MetadataNotFoundException("Unable to resolve metadata");
        }
    }

    /**
     * @param line data to be parsed
     * @param supplierId id of the supplier
     * @return supplierInfo information of the supplier
     */
    public SupplierInfo parse(String line, String supplierId) {
        if (line == null || line.length() == 0) {
            throw new DataNotFoundException("No metadata found");
        }
        String productId = null;
        long quantity = Long.MIN_VALUE;
        String[] data = line.split("\\s*,\\s*");
        for (int index=0; index<data.length; index++) {
            if (index == this.productIdIndex) {
                productId = data[index];
            } else if (index == this.quantityIdIndex) {
                quantity = Long.valueOf(data[index]);
            }
        }
        if (productId != null && quantity != Long.MIN_VALUE) {
            return new SupplierInfo(supplierId, productId, quantity);
        }
        if (productId == null) {
            throw new ProductIdInfoNotFoundException("No info regarding product id found");
        }
        if (quantity == Long.MIN_VALUE) {
            throw new QuantityInfoNotFound("No info regarding quantity found");
        }
        return null;
    }
}
