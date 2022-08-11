package com.shvetsov.training.util.city;

import com.shvetsov.training.cityBuilder.City;
import com.shvetsov.training.cityBuilder.CityBuilderImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CityDataListToCity {

    private static final int STANDARD_DATA_ARRAY_LENGTH = 5; //number of parameters in standard city (0 to 4)

    /**
     * Разбор списка массивов с данными о городе
     *
     * @param cityDataList список городов, где каждый массив - данные одного города
     * @return список городов
     */

    public List<City> getCityList(List<String[]> cityDataList) {

        List<City> cityList = new ArrayList<>();
        for (String[] cityPart : cityDataList) {

            if (cityPart.length < STANDARD_DATA_ARRAY_LENGTH) {
                cityPart = Arrays.copyOf(cityPart, STANDARD_DATA_ARRAY_LENGTH);
                cityPart[4] = null;
            }

            int cityPopulation = 0;
            String cityName = cityPart[0];
            String cityRegion = cityPart[1];
            String cityDistrict = cityPart[2];
            String cityFoundation = cityPart[4];

            try {
                cityPopulation = Integer.parseInt(cityPart[3]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } finally {
                City city = new CityBuilderImpl()
                        .setName(cityName)
                        .setRegion(cityRegion)
                        .setDistrict(cityDistrict)
                        .setPopulation(cityPopulation)
                        .setFoundation(cityFoundation)
                        .build();
                cityList.add(city);
            }
        }
        return cityList;
    }
}
