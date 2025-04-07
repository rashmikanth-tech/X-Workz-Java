package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.fiftyfold.ocean.Ocean;
import com.xworkz.extend.fiftyfold.ocean.Pacific;

public class OceanRunner {
    public static void main(String[] args) {
        Ocean ocean = new Pacific();
        ocean.depth();
        ocean.marineLife();
        ocean.waves();
        ocean.temperature();
        ocean.tides();

        System.out.println("-----------");

        Ocean ocean1 = new Ocean();
        ocean1.depth();
        ocean1.marineLife();
        ocean1.waves();
        ocean1.temperature();
        ocean1.tides();


        Pacific pacific = new Pacific();
        pacific.depth();
        pacific.marineLife();
        pacific.waves();
        pacific.temperature();
        pacific.tides();
    }
}
