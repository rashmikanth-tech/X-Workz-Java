package com.xworkz.extend.fiftyfold.game;

public class Chess extends Game {
    public Chess() {
        super();
        System.out.println("Running non-arg constructor Chess");
    }
    public void play() {
        System.out.println("Chess is played");
    }
    public void strategy() {
        System.out.println("Chess requires strategy");
    }
    public void opponent() {
        System.out.println("Chess has opponents");
    }
    public void winner() {
        System.out.println("Chess has a winner");
    }
    public void duration() {
        System.out.println("Chess has a duration");
    }
}
