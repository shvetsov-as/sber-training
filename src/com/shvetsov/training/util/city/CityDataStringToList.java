package com.shvetsov.training.util.city;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CityDataStringToList {

    /**
     * Разделение строки, содержащей все данные городов на список массивов с данными о конкретном городе
     *
     * @param cityData список массивов, где каждый массив - данные одного города
     * @return список городов
     */

    public List<String[]> getCityDataFromString(String cityData) {
        String[] splitData = cityData.split("\n");
        List<String[]> cityDataList = new ArrayList<>();

        for (String s : splitData) {
            String[] cityParts = Arrays.stream(s.split(";")).skip(1).toArray(String[]::new);
            cityDataList.add(cityParts);
        }

        return cityDataList;
    }
}
