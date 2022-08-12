package com.shvetsov.training.model;

import com.shvetsov.training.cityBuilder.City;

import java.util.List;

public interface CityMaxPopulation {
    String getCityWithMaxPopulation(List<City> cityList);
}
