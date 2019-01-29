package com.sh.BL;

import com.sh.model.FileInfo;
import com.sh.interfaces.Cron;

import java.util.ArrayList;
import java.util.List;

public class CronImpl implements Cron {
    private String folderPath;

    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    public List<FileInfo> getFilesToBeProcessed() {
        List<FileInfo> fileInfoList = new ArrayList<FileInfo>();
        // cron logic
        return fileInfoList;
    }
}
