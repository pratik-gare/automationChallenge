package com.sh.file;

import com.sh.enums.FileType;

public class FileInfo {
    private String fileName;
    private FileType fileType;
    private String filePath;

    public FileInfo(String fileName, FileType fileType, String filePath) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.filePath = filePath;
    }

    public FileType getFileType() {
        return fileType;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFilePath() {
        return filePath;
    }
}
