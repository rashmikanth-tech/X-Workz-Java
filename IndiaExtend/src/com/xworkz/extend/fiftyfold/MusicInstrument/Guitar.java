package com.xworkz.extend.fiftyfold.MusicInstrument;

public class Guitar extends MusicInstrument {
        public Guitar() {
            super();
            System.out.println("Running non-arg constructor Guitar");
        }
        @Override
    public void play() {
        System.out.println("Guitar is played");
    }
    public void sound() {
        System.out.println("Guitar produces sound");
    }
    public void type() {
        System.out.println("Guitar has a type");
    }
    public void maintenance() {
        System.out.println("Guitar requires maintenance");
    }
    public void brand() {
        System.out.println("Guitar has different brands");
    }
}
