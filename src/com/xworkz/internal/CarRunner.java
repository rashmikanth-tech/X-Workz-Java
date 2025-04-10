package com.xworkz.internal;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car("CapacityVal", "TypeVal", 35);
        System.out.println(car);

        Car car1 = new Car("CapacityVal", "TypeVal", 35);
        int ref = car1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
