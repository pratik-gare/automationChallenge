package com.sh.parser;

import com.sh.model.FileInfo;
import com.sh.model.SupplierInfo;
import com.sh.interfaces.Parser;

public class TABDELIMITEDParser implements Parser {
    private FileInfo fileInfo;

    public TABDELIMITEDParser(FileInfo fileInfo) {
        this.fileInfo = fileInfo;
    }

    public SupplierInfo parse() {
        return null;
    }
}
