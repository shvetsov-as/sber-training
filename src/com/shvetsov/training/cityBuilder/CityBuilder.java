package com.shvetsov.training.cityBuilder;

public interface CityBuilder<City> {

    CityBuilder<City> setName(String name);

    CityBuilder<City> setRegion(String region);

    CityBuilder<City> setDistrict(String district);

    CityBuilder<City> setPopulation(Integer population);

    CityBuilder<City> setFoundation(String foundation);

    City build();
}
