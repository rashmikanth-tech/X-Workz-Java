package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.fiftyfold.element.Element;
import com.xworkz.extend.fiftyfold.element.Oxygen;

public class ElementRunner {
    public static void main(String[] args) {
        Element element = new Oxygen();
        element.atomicNumber();
        element.symbol();
        element.state();
        element.bonding();
        element.reactivity();

        System.out.println("-----------");

        Oxygen oxygen = new Oxygen();
        oxygen.atomicNumber();
        oxygen.symbol();
        oxygen.state();
        oxygen.bonding();
        oxygen.reactivity();

        Element element1 = new Oxygen();
        element1.atomicNumber();
        element1.symbol();
        element1.state();
        element1.bonding();
        element1.reactivity();

    }
}
