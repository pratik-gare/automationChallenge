package com.sh.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * FileIterator iterates through a file line by line
 * thereby eliminating the need of loading the entire
 * file in memory.
 */
public class FileIterator {

    /**
     * inputs stream of bytes of a file
     */
    FileInputStream fileInputStream;


    /**
     * A simple text scanner which can parse primitive
     * types and strings using regular expressions
     */
    Scanner scanner;

    /**
     *
     * @param filePath file location
     * @throws IOException
     * @throws FileNotFoundException
     */
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

    /**
     * @return line of data in String format
     */
    public String getNextLine() {
        return scanner.nextLine();
    }

    /**
     * @return Returns true if there is another line in the
     * input of this scanner
     */
    public boolean hasNext() {
        return scanner.hasNextLine();
    }
}
