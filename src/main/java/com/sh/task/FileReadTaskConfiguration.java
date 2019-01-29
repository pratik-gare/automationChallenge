package com.sh.task;

public class FileReadTaskConfiguration implements TaskConfiguration {
    private String folderPath;

    public FileReadTaskConfiguration(String folderPath) {
        this.folderPath = folderPath;
    }

    public void setTaskConfiguration(String folderPath) {
        this.folderPath = folderPath;
    }
}
