package com.sh.parser;

import com.sh.model.FileInfo;
import com.sh.model.SupplierInfo;
import com.sh.interfaces.Parser;

public class TXTParser implements Parser {
    private FileInfo fileInfo;

    public TXTParser(FileInfo fileInfo) {
        this.fileInfo = fileInfo;
    }

    public SupplierInfo parse() {
        return null;
    }
}
