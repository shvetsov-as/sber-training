package com.shvetsov.training;

import com.shvetsov.training.model.CityParser;
import com.shvetsov.training.util.city.StringDataToCity;
import com.shvetsov.training.util.csv.CsvToString;
import com.shvetsov.training.util.string.StringToList;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class Main {

    private static final Path FILEPATH = Path.of("resources" + File.separatorChar + "city_ru.csv");
    private static final Charset CHARSET = StandardCharsets.UTF_8;

    public static void main(String[] args) {

        CityParser parser = new CityParser(new CsvToString(), new StringToList(), new StringDataToCity());

        System.out.println(parser.getCityList(FILEPATH, CHARSET));

    }

}
