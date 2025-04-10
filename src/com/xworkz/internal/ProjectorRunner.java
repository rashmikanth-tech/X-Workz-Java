package com.xworkz.internal;

public class ProjectorRunner {
    public static void main(String[] args) {
        Projector projector = new Projector(41, 26, 45);
        System.out.println(projector);

        Projector projector1 = new Projector(41, 26, 45);
        int ref = projector1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
