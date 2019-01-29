package com.sh.driver;

import com.sh.BL.CronImpl;
import com.sh.BL.FileProcessor;
import com.sh.model.FileInfo;
import com.sh.interfaces.Cron;

import java.util.List;

public class Client {
    public static void Main(String[] args) {
        Cron cronJob = new CronImpl();
        String folderPath = "";
        cronJob.setFolderPath(folderPath);
        List<FileInfo> filesToBeProcessed = cronJob.getFilesToBeProcessed();
        FileProcessor processor = new FileProcessor();
        processor.process(filesToBeProcessed);


    }
}
