package com.xworkz.internal;

public class ChairRunner {
    public static void main(String[] args) {
        Chair chair = new Chair(90, "ModelVal", "SizeVal");
        System.out.println(chair);

        Chair chair1 = new Chair(90, "ModelVal", "SizeVal");
        int ref = chair1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
