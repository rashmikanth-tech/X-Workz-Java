package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.fiftyfold.drink.Drink;
import com.xworkz.extend.fiftyfold.drink.Juice;

public class DrinkRunner {
    public static void main(String[] args) {
        Drink drink = new Juice();
        drink.sip();
        drink.refresh();
        drink.cold();
        drink.sweet();
        drink.healthy();

        System.out.println("--------");
        Juice juice=new Juice();
        juice.sip();
        juice.refresh();
        juice.cold();
        juice.sweet();
        juice.healthy();

        Drink  drink1 = new Juice();
        drink1.sip();
        drink1.refresh();
        drink1.cold();
        drink1.sweet();
        drink1.healthy();

    }
}
