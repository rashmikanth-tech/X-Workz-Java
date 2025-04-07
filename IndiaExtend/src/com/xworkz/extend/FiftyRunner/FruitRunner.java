package com.xworkz.extend.FiftyRunner;


import com.xworkz.extend.fiftyfold.fruit.Apple;
import com.xworkz.extend.fiftyfold.fruit.Fruit;

public class FruitRunner {
    public static void main(String[] args) {
        Fruit fruit=new Apple();
        fruit.taste();
        fruit.color();
        fruit.nutrients();
        fruit.seasonal();

        System.out.println("-----------");
        Apple apple = new Apple();
        apple.taste();
        apple.color();
        apple.nutrients();
        apple.seasonal();

        Fruit fruit1 = new Apple();
        fruit1.taste();
        fruit1.color();
        fruit1.nutrients();
        fruit1.seasonal();

    }
}
