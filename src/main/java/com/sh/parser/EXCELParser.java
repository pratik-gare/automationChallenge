package com.sh.parser;

import com.sh.model.FileInfo;
import com.sh.model.SupplierInfo;
import com.sh.interfaces.Parser;

public class EXCELParser implements Parser {

    private FileInfo fileInfo;

    public EXCELParser(FileInfo fileInfo) {
        this.fileInfo = fileInfo;
    }

    public SupplierInfo parse() {
        return null;
    }
}
