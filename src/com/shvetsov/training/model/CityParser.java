package com.shvetsov.training.model;

import com.shvetsov.training.cityBuilder.City;
import com.shvetsov.training.util.city.CityDataListToCity;
import com.shvetsov.training.util.city.CityDataCsvToString;
import com.shvetsov.training.util.city.CityDataStringToList;

import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.List;

public class CityParser {

    private final CityDataCsvToString cityDataCsvToString;
    private final CityDataStringToList cityDataStringToList;
    private final CityDataListToCity cityDataListToCity;

    public CityParser(CityDataCsvToString cityDataCsvToString, CityDataStringToList cityDataStringToList, CityDataListToCity cityDataListToCity) {
        this.cityDataCsvToString = cityDataCsvToString;
        this.cityDataStringToList = cityDataStringToList;
        this.cityDataListToCity = cityDataListToCity;
    }

    /**
     * Получение списка городов
     * @param filePath абсолютный путь к CSV файлу
     * @param charset кодировка CSV файла
     * @return список городов
     */

    public List<City> getCityList(Path filePath, Charset charset) {

        String parsedCsv = cityDataCsvToString.getStringFromCSV(filePath, charset);
        List<String[]> parsedData = cityDataStringToList.getCityDataFromString(parsedCsv);

        return cityDataListToCity.getCityList(parsedData);
    }

    /**
     * Вывод в System.out списка всех городов
     * @param cityList список всех городов
     */
    public void print(List<City> cityList) {
        cityList.forEach(System.out::println);
    }
}
