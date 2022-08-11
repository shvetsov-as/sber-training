package com.shvetsov.training.model;

import com.shvetsov.training.cityBuilder.City;
import com.shvetsov.training.util.city.StringDataToCity;
import com.shvetsov.training.util.csv.CsvToString;
import com.shvetsov.training.util.string.StringToList;

import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.List;

public class CityParser {

    private CsvToString csvToString;
    private StringToList stringToList;
    private StringDataToCity dataToCity;

    public CityParser(CsvToString csvToString, StringToList stringToList, StringDataToCity dataToCity){
        this.csvToString = csvToString;
        this.stringToList = stringToList;
        this.dataToCity = dataToCity;
    }

    public List<City> getCityList (Path filePath, Charset charset){

        String parsedCsv = csvToString.getStringFromCSV(filePath, charset);
        List<String[]> parsedData = stringToList.getCityDataFromString(parsedCsv);

        return dataToCity.getCityList(parsedData);
    }
}
