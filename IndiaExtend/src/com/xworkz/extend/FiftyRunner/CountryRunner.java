package com.xworkz.extend.FiftyRunner;


import com.xworkz.extend.fiftyfold.country.Country;
import com.xworkz.extend.fiftyfold.country.India;

public class CountryRunner {
    public static void main(String[] args) {
        Country country = new India();
        country.name();
        country.population();
        country.culture();
        country.economy();
        country.government();

        System.out.println("-----------");
        India india=new India();
        india.name();
        india.population();
        india.culture();
        india.economy();
        india.government();

        Country country1 = new India();
        country1.name();
        country1.population();
        country1.culture();
        country1.economy();
        country1.government();


    }
}
