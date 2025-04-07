package com.xworkz.extend.FiftyRunner;


import com.xworkz.extend.fiftyfold.furniture.Chair;
import com.xworkz.extend.fiftyfold.furniture.Furniture;

public class FurnitureRunner {
    public static void main(String[] args) {
        Furniture furniture = new Chair();
        furniture.support();
        furniture.material();
        furniture.weight();
        furniture.move();
        furniture.design();

        System.out.println("-----------");

        Chair chair = new Chair();
        chair.support();
        chair.material();
        chair.weight();
        chair.move();
        chair.design();

        Furniture furniture1 = new Chair();
        furniture1.support();
        furniture1.material();
        furniture1.weight();
        furniture1.move();
        furniture1.design();

    }
}
