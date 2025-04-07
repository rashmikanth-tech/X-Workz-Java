package com.xworkz.extend.FiftyRunner;


import com.xworkz.extend.fiftyfold.MusicInstrument.Guitar;
import com.xworkz.extend.fiftyfold.MusicInstrument.MusicInstrument;

public class MusicRunner {
    public static void main(String[] args) {
        MusicInstrument instrument=new Guitar();
        instrument.play();
        instrument.sound();
        instrument.type();
        instrument.maintenance();
        instrument.brand();

        MusicInstrument instrument1= new MusicInstrument();
        instrument1.play();
        instrument1.sound();
        instrument1.type();
        instrument1.maintenance();
        instrument1.brand();


        System.out.println("-----------");

        Guitar guitar=new Guitar();
        guitar.play();
        guitar.sound();
        guitar.type();
        guitar.maintenance();
        guitar.brand();
    }
}
