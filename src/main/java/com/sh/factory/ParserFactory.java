package com.sh.factory;

import com.sh.enums.FileType;
import com.sh.parser.Parser;
import com.sh.file.FileInfo;
import com.sh.parser.CSVParser;
import com.sh.parser.EXCELParser;
import com.sh.parser.TABDELIMITEDParser;
import com.sh.parser.TXTParser;

/**
 * Generates Parser instances
 */
public class ParserFactory {

    /**
     * Returns an instance of Parser based on fileType
     * @param fileInfo information of the file
     * @return Parser an instance of corresponding parser
     */
    public static Parser getFileParser(FileInfo fileInfo) {
        FileType fileType = fileInfo.getFileType();
        switch (fileType) {
            case CSV:
                return new CSVParser();
            case EXCEL:
                return new EXCELParser();
            case TAB_DELIMITED:
                return new TABDELIMITEDParser();
            case TXT:
                return new TXTParser();
        }
        return null;
    }
}
