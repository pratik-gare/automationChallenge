package com.sh.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileIterator {

    FileInputStream fileInputStream;
    Scanner scanner;

    public FileIterator(String filePath) throws IOException, FileNotFoundException {
        try {
            fileInputStream = new FileInputStream(filePath);
            scanner = new Scanner(fileInputStream, "UTF-8");
            // note that Scanner suppresses exceptions
            if (scanner.ioException() != null) {
                throw scanner.ioException();
            }
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    public String getNextLine() {
        return scanner.nextLine();
    }

    public boolean hasNext() {
        return scanner.hasNextLine();
    }
}
