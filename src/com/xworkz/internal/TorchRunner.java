package com.xworkz.internal;

public class TorchRunner {
    public static void main(String[] args) {
        Torch torch = new Torch(51, "SpeedVal", 76);
        System.out.println(torch);

        Torch torch1 = new Torch(51, "SpeedVal", 76);
        int ref = torch1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
