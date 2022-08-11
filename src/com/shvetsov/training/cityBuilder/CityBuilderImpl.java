package com.shvetsov.training.cityBuilder;

public class CityBuilderImpl implements CityBuilder<City>{

    private final City city = new City();

    @Override
    public CityBuilder<City> setName(String name) {
        city.setName(name);
        return this;
    }

    @Override
    public CityBuilder<City> setRegion(String region) {
        city.setRegion(region);
        return this;
    }

    @Override
    public CityBuilder<City> setDistrict(String district) {
        city.setDistrict(district);
        return this;
    }

    @Override
    public CityBuilder<City> setPopulation(Integer population) {
        city.setPopulation(population);
        return this;
    }

    @Override
    public CityBuilder<City> setFoundation(String foundation) {
        city.setFoundation(foundation);
        return this;
    }

    @Override
    public City build() {
        return city;
    }
}
