package com.shvetsov.training.util.string;

import java.util.ArrayList;
import java.util.List;

public class StringToList {

    public List<String[]> getCityDataFromString(String CityDataFromCsv) {
        String[] splitData = CityDataFromCsv.split("\n");
        List<String[]> cityDataList = new ArrayList<>();

        for(String s : splitData){
            String[] cityParts = s.split(";");
            cityDataList.add(cityParts);
        }

        return cityDataList;
    }
}
