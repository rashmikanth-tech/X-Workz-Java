package com.xworkz.extend.fiftyfold.country;

public class India extends Country {
    public India() {
        super();
        System.out.println("Running non-arg constructor India");
    }
    @Override
    public void name() {
        System.out.println("India has a name");
    }
    public void population() {
        System.out.println("India has a population");
    }
    public void culture() {
        System.out.println("India has a culture");
    }
    public void economy() {
        System.out.println("India has an economy");
    }
    public void government() {
        System.out.println("India has a government");
    }
}
