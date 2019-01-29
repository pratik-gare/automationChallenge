package com.sh.task;

/**
 * configuration of a task to read a file
 */
public class FileReadTaskConfiguration implements TaskConfiguration {

    /**
     * path of folder whose files has to be processed
     */
    private String folderPath;


    /**
     * @param folderPath path of folder whose files has to be processed
     */
    public FileReadTaskConfiguration(String folderPath) {
        this.folderPath = folderPath;
    }

    /**
     * sets the folder path
     * @param folderPath path of folder whose files has to be processed
     */
    public void setTaskConfiguration(String folderPath) {
        this.folderPath = folderPath;
    }
}
