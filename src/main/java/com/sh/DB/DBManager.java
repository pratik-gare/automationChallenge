package com.sh.DB;

import com.sh.supplier.SupplierInfo;

import java.util.List;

public interface DBManager {
    public void insertOrUpdate(List<SupplierInfo> supplierInfoList);
    // add more common functionalities as needed
}
