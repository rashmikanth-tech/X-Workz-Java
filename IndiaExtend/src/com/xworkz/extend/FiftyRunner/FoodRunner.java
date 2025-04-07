package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.fiftyfold.food.Burger;
import com.xworkz.extend.fiftyfold.food.Food;

public class FoodRunner {
    public static void main(String[] args) {
        Food food = new Burger();
        food.eat();
        food.taste();
        food.cook();
        food.healthy();
        food.spicy();

        Food food1 =new Food();
        food1.eat();
        food1.taste();
        food1.cook();
        food1.healthy();
        food1.spicy();



        System.out.println("--------------");
        Burger burger=new Burger();
        burger.eat();
        burger.taste();
        burger.cook();
        burger.healthy();
        burger.spicy();

    }
}
