package com.shvetsov.training.cityBuilder;

public class City {

    private String name; //наименование города
    private String region; //регион
    private String district; //федеральный округ
    private Integer population; //количество жителей города
    private String foundation; //дата основания или первое упоминание

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;

        City city = (City) o;

        if (!getName().equals(city.getName())) return false;
        return getRegion().equals(city.getRegion());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getRegion().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                ", foundation='" + foundation + '\'' +
                '}';
    }
}
