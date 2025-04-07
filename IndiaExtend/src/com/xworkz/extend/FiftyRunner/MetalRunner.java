package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.fiftyfold.metal.Gold;
import com.xworkz.extend.fiftyfold.metal.Metal;

public class MetalRunner {
    public static void main(String[] args) {
        Metal metal = new Gold();
        metal.conductivity();
        metal.durability();
        metal.malleability();
        metal.density();
        metal.corrosion();

        Metal metal1 = new Metal();
        metal1.conductivity();
        metal1.durability();
        metal1.malleability();
        metal1.density();
        metal1.corrosion();


        System.out.println("-----------");

        Gold gold = new Gold();
        gold.conductivity();
        gold.durability();
        gold.malleability();
        gold.density();
        gold.corrosion();
    }
}
