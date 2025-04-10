package com.xworkz.internal;

public class BallRunner {
    public static void main(String[] args) {
        Ball ball = new Ball(41, 69, 40);
        System.out.println(ball);

        Ball ball1 = new Ball(41, 69, 40);
        int ref = ball1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
