package com.shvetsov.training.model;

import com.shvetsov.training.cityBuilder.City;

import java.util.List;

public interface CitySort {
    List<City> sortByName(List<City> cityList);
    List<City> sortByDistrictAndNameV1(List<City> cityList);
    void sortByDistrictAndName(List<City> cityList);
}
