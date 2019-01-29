package com.sh.file;

import com.sh.DB.DBConfiguration;
import com.sh.DB.DBManager;
import com.sh.factory.DBFactory;
import com.sh.parser.Parser;
import com.sh.factory.ParserFactory;
import com.sh.supplier.SupplierInfo;
import com.sh.task.TaskConfiguration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Processes files
 */
public class FileProcessor {

    /**
     * fileInfoList list of file information to be processed
     */
    private List<FileInfo> fileInfoList;

    private DBManager dbManager;

    /**
     * @param taskConfiguration task configuration
     * @param dbConfiguration configuration of the db
     */
    public FileProcessor(TaskConfiguration taskConfiguration, DBConfiguration dbConfiguration) {
        fileInfoList = new ArrayList<FileInfo>();
        updateFilesToBeProcessed(taskConfiguration);
        dbManager = DBFactory.getDBManager(dbConfiguration);
    }

    /**
     * @param taskConfiguration task configuration
     */
    public void updateFilesToBeProcessed(TaskConfiguration taskConfiguration) {
        // use folder path to access the folder from taskConfiguration
        // load all the file information to be processed from the folder specified in task config
    }

    /**
     * persists the data extracted from the files to corresponding DB
     */
    public void process() {
        for (FileInfo fileInfo: fileInfoList) {
            List<SupplierInfo> supplierInfoList = extract(fileInfo);
            dbManager.insertOrUpdate(supplierInfoList);
        }
    }

    /**
     * extracts information regarding the supplier which has to be stored in DB
     * @param fileInfo file information
     * @return list of supplier information
     */
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
