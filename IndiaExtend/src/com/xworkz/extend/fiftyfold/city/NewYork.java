package com.xworkz.extend.fiftyfold.city;

public class NewYork extends City {
    public NewYork() {
        super();
        System.out.println("Running non-arg constructor NewYork");
    }
    @Override
    public void population() {
        System.out.println("NewYorkCity has a population");
    }
    public void infrastructure() {
        System.out.println("NewYorkCity has infrastructure");
    }
    public void tourism() {
        System.out.println("NewYorkCity attracts tourists");
    }
    public void culture() {
        System.out.println("NewYorkCity has a diverse culture");
    }
    public void economy() {
        System.out.println("NewYorkCity has an economy");
    }
}
