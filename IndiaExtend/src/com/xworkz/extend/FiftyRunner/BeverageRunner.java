package com.xworkz.extend.FiftyRunner;


import com.xworkz.extend.fiftyfold.beverage.Beverage;
import com.xworkz.extend.fiftyfold.beverage.Coffee;

public class BeverageRunner {
    public static void main(String[] args) {
        Beverage beverage=new Coffee();
        beverage.drink();
        beverage.temperature();
        beverage.flavor();
        beverage.refresh();

        System.out.println("-----------");
        Coffee coffee = new Coffee();
        coffee.drink();
        coffee.temperature();
        coffee.flavor();
        coffee.refresh();

        System.out.println("-----------");
        Beverage beverage1 = new Coffee();
        beverage1.drink();
        beverage1.temperature();
        beverage1.flavor();
        beverage1.refresh();
    }
}
