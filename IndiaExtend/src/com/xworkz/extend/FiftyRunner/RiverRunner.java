package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.River;
import com.xworkz.extend.fiftyfold.river.Nile;

public class RiverRunner {
    public static void main(String[] args) {


        System.out.println("-----------");

        Nile nile = new Nile();
        nile.length();
        nile.origin();
        nile.flows();
        nile.providesWater();
        nile.wildlife();
    }
}
