package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.fiftyfold.transportation.Train;
import com.xworkz.extend.fiftyfold.transportation.Transportation;

public class TransportationRunner {
    public static void main(String[] args) {
        Transportation transport = new Train();
        transport.move();
        transport.speed();
        transport.fuel();
        transport.capacity();
        transport.type();

        System.out.println("-----------");

        Train train = new Train();
        train.move();
        train.speed();
        train.fuel();
        train.capacity();
        train.type();
    }
}
