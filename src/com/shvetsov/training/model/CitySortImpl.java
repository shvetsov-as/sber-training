package com.shvetsov.training.model;

import com.shvetsov.training.cityBuilder.City;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CitySortImpl implements CitySort {

    /**
     * Сортировка по наименованию города
     * без учета регистра
     *
     * @param cityList список городов
     * @return отсортированный список по наименованию
     */

    @Override
    public List<City> sortByName(List<City> cityList) {
        return cityList.stream().sorted((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName())).collect(Collectors.toList());
    }

    /**
     * Сортировка по двум полям справочника – федеральному округу и наименованию города
     * с учетом регистра
     *
     * @param cityList список городов
     * @return отсортированный список по округу и наименованию
     */

    @Override
    public void sortByDistrictAndName(List<City> cityList) {
        cityList.sort(Comparator.comparing(City::getDistrict).thenComparing(City::getName));
    }

    @Override
    public List<City> sortByDistrictAndNameV1(List<City> cityList) {
        return cityList.stream().sorted(new Comparator<>() {
            @Override
            public int compare(City o1, City o2) {
                int res = o1.getDistrict().compareTo(o2.getDistrict());
                if (res == 0) {
                    return o1.getName().compareTo(o2.getName());
                }
                return res;
            }
        }).collect(Collectors.toList());
    }
}
