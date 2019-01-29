package com.sh.interfaces;

import com.sh.model.SupplierInfo;

public interface Parser {
    public void setProductIdIndex(int columnNumber);
    public void setQuantityIndex(int columnNumber);
    public void updateMetadata(String line, String productKeyword, String quantityKeyword);
    public SupplierInfo parse(String line, String supplierId);
}
