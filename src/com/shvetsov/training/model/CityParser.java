package com.shvetsov.training.model;

import com.shvetsov.training.cityBuilder.City;

import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.List;

public interface CityParser {

    List<City> getCityList(Path filePath, Charset charset);

    void print(List<City> cityList);
}
