package com.xworkz.internal;

public class RaincoatRunner {
    public static void main(String[] args) {
        Raincoat raincoat = new Raincoat(34, 33, "SpeedVal");
        System.out.println(raincoat);

        Raincoat raincoat1 = new Raincoat(34, 33, "SpeedVal");
        int ref = raincoat1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
