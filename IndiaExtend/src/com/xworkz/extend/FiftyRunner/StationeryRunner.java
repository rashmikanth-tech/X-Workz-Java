package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.fiftyfold.stationery.Pen;
import com.xworkz.extend.fiftyfold.stationery.Stationery;

public class StationeryRunner {
    public static void main(String[] args) {
        Stationery stationery=new Pen();
        stationery.write();
        stationery.erase();
        stationery.color();
        stationery.size();

        System.out.println("-----------");
        Pen pen = new Pen();
        pen.write();
        pen.erase();
        pen.color();
        pen.size();
    }
}
