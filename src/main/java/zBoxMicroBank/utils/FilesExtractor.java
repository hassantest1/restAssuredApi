package zBoxMicroBank.utils;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class FilesExtractor {
    public List<String> readCSVFileToList() throws IOException {
        List<String> csvDataList = new ArrayList<>();

        try (Reader reader = new FileReader("D:\\eclipse-workspace\\APIAutomationFWJavaRestAssured\\src\\main\\java\\com\\restassured\\files\\Account details.csv");
             CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT)) {

            for (CSVRecord csvRecord : csvParser) {
                String csvRecordString = csvRecord.toString();
                csvDataList.add(csvRecordString);
            }
        }

        return csvDataList;
    }
}

