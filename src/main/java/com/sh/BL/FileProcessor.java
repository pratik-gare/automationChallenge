package com.sh.BL;

import com.sh.interfaces.Parser;
import com.sh.model.FileInfo;
import com.sh.factory.FileTypeFactory;
import com.sh.model.SupplierInfo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {

    public void process(List<FileInfo> fileInfoList) {
        for (FileInfo fileInfo: fileInfoList) {
            List<SupplierInfo> supplierInfoList = extract(fileInfo);
            //persist into DB file by file
        }
    }

    private List<SupplierInfo> extract(FileInfo fileInfo) {
        FileIterator fileIterator = null;
        try {
            fileIterator = new FileIterator(fileInfo.getFilePath());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        List<SupplierInfo> supplierInfoList = new ArrayList<SupplierInfo>();
        Parser parser = FileTypeFactory.getFileParser(fileInfo);

        if (fileIterator.hasNext()) {
            parser.updateMetadata(fileIterator.getNextLine(), "Product", "Quantity");
        }
        while (fileIterator.hasNext()) {
            supplierInfoList.add(parser.parse(fileIterator.getNextLine(), fileInfo.getFileName()));
        }

        return supplierInfoList;
    }
}
