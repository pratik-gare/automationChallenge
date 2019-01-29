package com.sh.factory;

import com.sh.enums.FileType;
import com.sh.interfaces.Parser;
import com.sh.model.FileInfo;
import com.sh.parser.CSVParser;
import com.sh.parser.EXCELParser;
import com.sh.parser.TABDELIMITEDParser;
import com.sh.parser.TXTParser;

public class FileTypeFactory {
    public static Parser getFileParser(FileInfo fileInfo) {
        FileType fileType = fileInfo.getFileType();
        switch (fileType) {
            case CSV:
                return new CSVParser(fileInfo);
            case EXCEL:
                return new EXCELParser(fileInfo);
            case TAB_DELIMITED:
                return new TABDELIMITEDParser(fileInfo);
            case TXT:
                return new TXTParser(fileInfo);
        }
        return null;
    }
}
