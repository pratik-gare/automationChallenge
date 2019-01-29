package com.sh.file;

import com.sh.enums.FileType;

/**
 * Information of the file
 */
public class FileInfo {
    /**
     *  name of the file
     */
    private String fileName;

    /**
     * type of the file
     */
    private FileType fileType;

    /**
     * path of the file location
     */
    private String filePath;

    /**
     * @param fileName name of the file
     * @param fileType type of the file
     * @param filePath path of the file location
     */
    public FileInfo(String fileName, FileType fileType, String filePath) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.filePath = filePath;
    }

    /**
     * @return type of the file
     */
    public FileType getFileType() {
        return fileType;
    }

    /**
     * @return name of the file
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @return path of the file location
     */
    public String getFilePath() {
        return filePath;
    }
}
