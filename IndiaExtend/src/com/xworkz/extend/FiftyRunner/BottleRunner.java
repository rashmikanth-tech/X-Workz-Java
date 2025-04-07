package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.fiftyfold.bottle.Bottle;
import com.xworkz.extend.fiftyfold.bottle.Cap;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle1= new Bottle();
        bottle1.fill();
        bottle1.frozen();
        bottle1.glass();
        bottle1.milk();
        bottle1.water();
        System.out.println("----------");

        Bottle bottle=new Cap();
        bottle.fill();
        bottle.frozen();
        bottle.glass();
        bottle.milk();
        bottle.water();

        System.out.println("----------");
        Cap cap = new Cap();
        cap.fill();
        cap.frozen();
        cap.glass();
        cap.milk();
        cap.water();

    }
}
