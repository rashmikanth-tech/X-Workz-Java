package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.fiftyfold.mountain.Everest;
import com.xworkz.extend.fiftyfold.mountain.Mountain;

public class MountainRunner {
    public static void main(String[] args) {
        Mountain mountain = new Everest();
        mountain.height();
        mountain.climate();
        mountain.location();
        mountain.trekking();
        mountain.wildlife();

        Mountain mountain1 = new Mountain();
        mountain1.height();
        mountain1.climate();
        mountain1.location();
        mountain1.trekking();
        mountain1.wildlife();

        System.out.println("-----------");

        Everest everest = new Everest();
        everest.height();
        everest.climate();
        everest.location();
        everest.trekking();
        everest.wildlife();
    }
}
