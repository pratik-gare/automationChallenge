package com.sh.BL;

import com.sh.model.FileInfo;
import com.sh.factory.FileTypeFactory;
import com.sh.model.SupplierInfo;

import java.util.List;

public class FileProcessor {

    public void process(List<FileInfo> files) {
        for (FileInfo fileInfo: files) {
            extract(fileInfo);
        }
    }

    private SupplierInfo extract(FileInfo fileInfo) {
        return FileTypeFactory.getFileParser(fileInfo).parse();
    }
}
