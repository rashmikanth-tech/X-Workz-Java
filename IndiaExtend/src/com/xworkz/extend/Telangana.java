package com.xworkz.extend;

public class Telangana extends TelanganaParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden Info: Telangana is the 29th state of India, formed in 2014.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden Animal: The Spotted Deer is commonly found in forests of Telangana.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden Bird: The Indian Roller is known for its vibrant blue wings.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden Sport: Kabaddi is a traditional and widely played sport in Telangana.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden Flower: Tangedu flowers are used during the Bathukamma festival.");
    }
}
