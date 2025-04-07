package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.fiftyfold.festival.Diwali;
import com.xworkz.extend.fiftyfold.festival.Festival;

public class FestivalRunner {
    public static void main(String[] args) {
        Festival festival=new Diwali();
        festival.celebrate();
        festival.traditions();
        festival.holidays();
        festival.food();

        System.out.println("-----------");
        Diwali diwali = new Diwali();
        diwali.celebrate();
        diwali.traditions();
        diwali.holidays();
        diwali.food();

        Festival festival1 = new Diwali();
        festival1.celebrate();
        festival1.traditions();
        festival1.holidays();
        festival1.food();
    }
}
