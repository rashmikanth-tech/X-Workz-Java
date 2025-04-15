package com.xworkz.typeofInherit.Multilevel_Inheritance;

public class Runner {
    public static void main(String[] args) {
        //1.
        Dog dog=new Dog();
        dog.bark();
        dog.eat();
        dog.walk();
        //2.
        SportsCar sportsCar=new SportsCar();
        sportsCar.speedUp();
        sportsCar.drive();
        sportsCar.start();
        //3.
        Manager manager=new Manager();
        manager.manage();
        manager.speak();
        manager.work();
        //4.
        ColorfulRectangle colorfulRectangle=new ColorfulRectangle();
        colorfulRectangle.fillColor();
        colorfulRectangle.draw();
        colorfulRectangle.calculateArea();
        //5.
        LeadDeveloper leadDeveloper=new LeadDeveloper();
        leadDeveloper.leadTeam();
        leadDeveloper.work();
        leadDeveloper.writeCode();
        //6.
        SmartWashingMachine smartWashingMachine=new SmartWashingMachine();
        smartWashingMachine.washClothes();
        smartWashingMachine.connectToWifi();
        smartWashingMachine.turnOn();
        //7.
        Villa villa=new Villa();
        villa.addPool();
        villa.addRooms();
        villa.construct();
        //8.
        Rose rose=new Rose();
        rose.releaseFragrance();
        rose.bloom();
        rose.grow();
        //9.
        Executive executive=new Executive();
        executive.makeStrategicDecisions();
        executive.overseeWork();
        executive.performTasks();
        //10.
        Lion lion=new Lion();
        lion.roar();
        lion.breathe();
        lion.roam();
        //11.
        Cameraphone cameraphone=new Cameraphone();
        cameraphone.takePhoto();
        cameraphone.powerOn();
        cameraphone.makeCall();
    }
}
