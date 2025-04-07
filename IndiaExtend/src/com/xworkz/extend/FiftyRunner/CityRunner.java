package com.xworkz.extend.FiftyRunner;


import com.xworkz.extend.fiftyfold.city.City;
import com.xworkz.extend.fiftyfold.city.NewYork;

public class CityRunner {
    public static void main(String[] args) {

        City city1 = new City();
        city1.population();
        city1.infrastructure();
        city1.tourism();
        city1.culture();
        city1.economy();

        City city = new NewYork();
        city.population();
        city.infrastructure();
        city.tourism();
        city.culture();
        city.economy();

        System.out.println("-----------");

        NewYork newYork = new NewYork();
        newYork.population();
        newYork.infrastructure();
        newYork.tourism();
        newYork.culture();
        newYork.economy();
    }
}
