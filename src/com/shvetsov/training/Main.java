package com.shvetsov.training;

import com.shvetsov.training.cityBuilder.City;
import com.shvetsov.training.model.CityParser;
import com.shvetsov.training.util.city.CityDataCsvToString;
import com.shvetsov.training.util.city.CityDataListToCity;
import com.shvetsov.training.util.city.CityDataStringToList;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.List;

public class Main {

    private static final Path FILEPATH = Path.of("resources" + File.separatorChar + "city_ru.csv");
    private static final Charset CHARSET = StandardCharsets.UTF_8;

    public static void main(String[] args) {

        CityParser parser = new CityParser(new CityDataCsvToString(), new CityDataStringToList(), new CityDataListToCity());

        List<City> cityList = parser.getCityList(FILEPATH, CHARSET);

        parser.print(cityList);
    }

}
