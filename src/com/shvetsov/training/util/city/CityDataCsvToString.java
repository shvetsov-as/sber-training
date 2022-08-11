package com.shvetsov.training.util.city;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.Scanner;

public class CityDataCsvToString {

    private static final String DELIMITER = "\n";

    /**
     * Преобразование CSV с данными о городах в сторку с добавлением разделителя
     *
     * @param filePath абсолютный путь к CSV файлу
     * @param charset кодировка CSV файла
     * @return строка городов
     */

    public String getStringFromCSV(Path filePath, Charset charset) {

        StringBuilder sb = new StringBuilder();

        try (Scanner sc = new Scanner(filePath, charset)) {
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
