package com.sh;

import com.sh.DB.DBConfiguration;
import com.sh.task.FileReadTaskConfiguration;
import com.sh.file.FileProcessor;
import com.sh.task.TaskConfiguration;

public class Main {
    public static void Main(String[] args) {
        String folderPath = "";
        TaskConfiguration taskConfiguration = new FileReadTaskConfiguration(folderPath);
        DBConfiguration dbConfiguration = new DBConfiguration();
        FileProcessor processor = new FileProcessor(taskConfiguration, dbConfiguration);
        processor.process();
    }
}
