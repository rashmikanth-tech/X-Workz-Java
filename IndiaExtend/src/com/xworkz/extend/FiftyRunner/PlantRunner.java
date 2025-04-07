package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.fiftyfold.flower.Flower;
import com.xworkz.extend.fiftyfold.plant.Plant;

public class PlantRunner {
    public static void main(String[] args) {
        Plant plant = new Plant();
        plant.grow();
        plant.photosynthesis();
        plant.absorbWater();
        plant.provideOxygen();
        plant.reproduce();



        System.out.println("-----------");

        Flower flower = new Flower();
        flower.bloom();
        flower.color();
        flower.fragrance();
        flower.pollination();
        flower.petals();

        Plant plant1 = new com.xworkz.extend.fiftyfold.plant.Flower();
        plant1.grow();
        plant1.photosynthesis();
        plant1.absorbWater();
        plant1.provideOxygen();
        plant1.reproduce();

    }
}
