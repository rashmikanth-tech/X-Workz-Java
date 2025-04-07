package com.xworkz.extend.FiftyRunner;


import com.xworkz.extend.fiftyfold.bird.Bird;
import com.xworkz.extend.fiftyfold.bird.Eagle;

public class BirdRunner {
    public static void main(String[] args) {

        Bird bird1 = new Bird();
        bird1.fly();
        bird1.feathers();
        bird1.laysEggs();
        bird1.sound();
        bird1.vision();

        System.out.println("-----------");

        Bird bird = new Eagle();
        bird.fly();
        bird.feathers();
        bird.laysEggs();
        bird.sound();
        bird.vision();

        System.out.println("-----------");

        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.feathers();
        eagle.laysEggs();
        eagle.sound();
        eagle.vision();
    }
}
