package com.shvetsov.training.util.city;

import com.shvetsov.training.cityBuilder.City;
import com.shvetsov.training.cityBuilder.CityBuiderImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringDataToCity {

    private static final int BAD_DATA = -1;
    private static final int STANDARD_DATA_ARRAY_LENGTH = 6;

    public List<City> getCityList(List<String[]> cityDataList) {

        List<City> cityList = new ArrayList<>();
        for (String[] cityPart : cityDataList) {

            if (cityPart.length < STANDARD_DATA_ARRAY_LENGTH) {

                cityPart = Arrays.copyOf(cityPart, STANDARD_DATA_ARRAY_LENGTH);
                for (int i = 0; i < cityPart.length; i++) {
                    if (cityPart[i] == null) {
                        cityPart[i] = String.valueOf(BAD_DATA);
                    }
                }

            }

            int cityId = BAD_DATA;
            int cityPopulation = BAD_DATA;
            String cityName = cityPart[1];
            String cityRegion = cityPart[2];
            String cityDistrict = cityPart[3];
            String cityFoundation = cityPart[5];

            try {
                cityId = Integer.parseInt(cityPart[0]);
                cityPopulation = Integer.parseInt(cityPart[4]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } finally {
                City city = new CityBuiderImpl()
                        .setCityId(cityId)
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
