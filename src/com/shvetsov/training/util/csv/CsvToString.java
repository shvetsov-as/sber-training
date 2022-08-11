package com.shvetsov.training.util.csv;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.Scanner;

public class CsvToString {

    private String result;
    private static final String DELIMITER = "\n";

    public String getStringFromCSV(Path path, Charset charset) {

        StringBuilder sb = new StringBuilder();

        try (Scanner sc = new Scanner(path, charset)) {
            while (sc.hasNext()) {
                sb.append(sc.nextLine());
                sb.append(DELIMITER);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
