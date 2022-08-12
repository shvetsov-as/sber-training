package com.shvetsov.training.model;

import com.shvetsov.training.cityBuilder.City;

import java.util.List;

public class CityMaxPopulationImpl implements CityMaxPopulation{

    /**
     * Преобразовывает список городов в массив и путем перебора массива находит
     * индекс элемента и значение с наибольшим количеством жителей города
     *
     * @param cityList список городов
     * @return Строка вида
     * "[индекс элемента массива] = количество жителей города"
     */

    @Override
    public String getCityWithMaxPopulation(List<City> cityList) {
        City[] cities = cityList.toArray(City[]::new);

        return maxPopElement(cities);
    }

    private String maxPopElement (City[] cities){

        int maxPop = cities[0].getPopulation();
        int maxIndex = 0;

        for(int i = 1; i < cities.length; i++){

            if(cities[i].getPopulation() > maxPop){
                maxPop = cities[i].getPopulation();
                maxIndex = i;
            }
        }
        return String.format("[%s] = %s", maxIndex, maxPop);
    }
}
