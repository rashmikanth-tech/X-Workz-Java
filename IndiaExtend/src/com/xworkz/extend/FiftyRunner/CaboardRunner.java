package com.xworkz.extend.FiftyRunner;


import com.xworkz.extend.fiftyfold.caboard.Caboard;
import com.xworkz.extend.fiftyfold.caboard.Door;

public class CaboardRunner {
    public static void main(String[] args) {
        Caboard caboard=new Door();
        caboard.close();
        caboard.key();
        caboard.lock();
        caboard.handle();
        caboard.open();

        Caboard caboard1 = new Door();
        caboard1.close();
        caboard1.key();
        caboard1.lock();
        caboard1.handle();
        caboard1.open();

        System.out.println("-----------");
        Door door=new Door();
        door.close();
        door.key();
        door.handle();
        door.open();
        door.lock();

    }

}
