package com.shvetsov.training;

import com.shvetsov.training.cityBuilder.City;
import com.shvetsov.training.model.CityInRegionCount;
import com.shvetsov.training.model.CityInRegionCountImpl;
import com.shvetsov.training.model.CityMaxPopulation;
import com.shvetsov.training.model.CityMaxPopulationImpl;
import com.shvetsov.training.model.CityParser;
import com.shvetsov.training.model.CityParserImpl;
import com.shvetsov.training.model.CitySort;
import com.shvetsov.training.model.CitySortImpl;
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

        CityParser parser = new CityParserImpl(new CityDataCsvToString(), new CityDataStringToList(), new CityDataListToCity());
        CitySort cityListSort = new CitySortImpl();
        CityMaxPopulation cityMaxPopulation = new CityMaxPopulationImpl();
        CityInRegionCount citiesInRegion = new CityInRegionCountImpl();

        List<City> cityList = parser.getCityList(FILEPATH, CHARSET);
        //cityList = cityListSort.sortByName(cityList);
        //cityList = cityListSort.sortByDistrictAndName(cityList);
        //cityListSort.sortByDistrictAndName(cityList);


        //parser.print(cityList);

        //System.out.println(cityMaxPopulation.getCityWithMaxPopulation(cityList));

        citiesInRegion.print(citiesInRegion.count(cityList));


    }

}
