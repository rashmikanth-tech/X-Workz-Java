package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.fiftyfold.festival.Festival;
import com.xworkz.extend.fiftyfold.flower.Flower;
import com.xworkz.extend.fiftyfold.flower.Rose;

public class FlowerRunner {
    public static void main(String[] args) {
        Flower flower = new Rose();
        flower.bloom();
        flower.fragrance();
        flower.color();
        flower.petals();
        flower.pollination();

        System.out.println("-----------");

        Rose rose = new Rose();
        rose.bloom();
        rose.fragrance();
        rose.color();
        rose.petals();
        rose.pollination();

        Flower flower1 = new Rose();
        flower1.bloom();
        flower1.fragrance();
        flower1.color();
        flower1.petals();
        flower1.pollination();

    }
}
