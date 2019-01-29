package com.sh.file;

import com.sh.parser.Parser;
import com.sh.factory.ParserFactory;
import com.sh.supplier.SupplierInfo;
import com.sh.task.TaskConfiguration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {

    List<FileInfo> fileInfoList;

    public FileProcessor(TaskConfiguration taskConfiguration) {
        fileInfoList = new ArrayList<FileInfo>();
        updateFilesToBeProcessed(taskConfiguration);
    }

    public void updateFilesToBeProcessed(TaskConfiguration taskConfiguration) {
        // use folder path to access the folder from taskconfiguration
        // get all the files to be processed by the some logic
    }

    public void process() {
        for (FileInfo fileInfo: fileInfoList) {
            List<SupplierInfo> supplierInfoList = extract(fileInfo);
            // persist into DB file by file
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
        Parser parser = ParserFactory.getFileParser(fileInfo);

        if (fileIterator.hasNext()) {
            parser.updateMetadata(fileIterator.getNextLine(), "Product", "Quantity");
        }
        while (fileIterator.hasNext()) {
            supplierInfoList.add(parser.parse(fileIterator.getNextLine(), fileInfo.getFileName()));
        }
        return supplierInfoList;
    }
}
