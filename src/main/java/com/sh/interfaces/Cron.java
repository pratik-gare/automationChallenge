package com.sh.interfaces;

import com.sh.model.FileInfo;

import java.util.List;

public interface Cron {
    public void setFolderPath(String folderPath);
    public List<FileInfo> getFilesToBeProcessed();
}
