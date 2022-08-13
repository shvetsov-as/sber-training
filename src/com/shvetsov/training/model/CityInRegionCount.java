package com.shvetsov.training.model;

import com.shvetsov.training.cityBuilder.City;

import java.util.List;
import java.util.Map;

public interface CityInRegionCount {

    void print (Map<String, Integer> citiesInRegionCount);

    void printV2 (Map<String, Integer> citiesInRegionCount);

    Map<String, Integer> count (List<City> cityList);

    Map<String, Integer> countV2 (List<City> cityList);
}
