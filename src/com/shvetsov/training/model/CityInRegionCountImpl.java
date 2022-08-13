package com.shvetsov.training.model;

import com.shvetsov.training.cityBuilder.City;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CityInRegionCountImpl implements CityInRegionCount {

    /**
     * Вывод в консоль Map <Наименование региона, Количество городов>
     *
     * @param citiesInRegionCount Map < Наименование региона, Количество городов >
     *                            <p> < K > - String
     *                            <p> < V > - Integer
     */

    @Override
    public void print(Map<String, Integer> citiesInRegionCount) {
        for (Map.Entry<String, Integer> entry : citiesInRegionCount.entrySet()) {
            System.out.println(MessageFormat.format("{0} - {1}", entry.getKey(), entry.getValue()));
        }
    }

    /**
     * Вывод в консоль (v.2 lambda-expression)
     * <p>
     * Смотри
     * {@link CityInRegionCountImpl#print(Map)}
     */

    @Override
    public void printV2(Map<String, Integer> citiesInRegionCount) {
        citiesInRegionCount.forEach((k, v) -> System.out.println(MessageFormat.format(" {0} = {1}", k, v)));
    }

    /**
     * Поиск количества городов в регионе
     *
     * @param cityList список городов
     * @return Map < Наименование региона, Количество городов >
     * <p> < K > - String
     * <p> < V > - Integer
     */

    @Override
    public Map<String, Integer> count(List<City> cityList) {

        Map<String, Integer> citiesInRegionCount = new HashMap<>();
        Integer count = 1;

        cityList.forEach(city -> {
            if (!citiesInRegionCount.containsKey(city.getRegion())) {
                citiesInRegionCount.put(city.getRegion(), count);
            } else {
                citiesInRegionCount.put(city.getRegion(), citiesInRegionCount.get(city.getRegion()) + count);
            }
        });
        return citiesInRegionCount;
    }

    /**
     * Поиск количества городов в регионе (v.2 lambda-expression)
     * <p>
     * Смотри
     * {@link CityInRegionCountImpl#count(List)}
     */

    @Override
    public Map<String, Integer> countV2(List<City> cityList) {

        Map<String, Integer> citiesInRegionCount = new HashMap<>();
        Integer count = 1;

        cityList.forEach(city -> citiesInRegionCount.merge(city.getRegion(), count, Integer::sum));

        return citiesInRegionCount;
    }
}
