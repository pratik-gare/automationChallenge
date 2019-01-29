package com.sh;

import com.sh.task.FileReadTaskConfiguration;
import com.sh.file.FileProcessor;
import com.sh.task.TaskConfiguration;

public class Main {
    public static void Main(String[] args) {
        String folderPath = "";
        TaskConfiguration taskConfiguration = new FileReadTaskConfiguration(folderPath);
        FileProcessor processor = new FileProcessor(taskConfiguration);
        processor.process();
    }
}
