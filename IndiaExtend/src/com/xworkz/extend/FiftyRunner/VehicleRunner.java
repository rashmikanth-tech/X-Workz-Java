package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.fiftyfold.vehicle.Car;
import com.xworkz.extend.fiftyfold.vehicle.Vehicle;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.move();
        vehicle.stop();
        vehicle.fuel();
        vehicle.speed();
        vehicle.transport();

        System.out.println("-----------");
        Car car=new Car();
        car.move();
        car.stop();
        car.fuel();
        car.speed();
        car.transport();

    }
}
