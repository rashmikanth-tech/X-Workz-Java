package com.xworkz.extend.FiftyRunner;


import com.xworkz.extend.fiftyfold.clothing.Clothing;
import com.xworkz.extend.fiftyfold.clothing.TShirt;

public class ClothingRunner {
    public static void main(String[] args) {
        Clothing clothing1 = new Clothing();
        clothing1.wear();
        clothing1.material();
        clothing1.size();
        clothing1.brand();
        clothing1.design();

        Clothing clothing = new TShirt();
        clothing.wear();
        clothing.material();
        clothing.size();
        clothing.brand();
        clothing.design();

        System.out.println("-----------");

        TShirt tShirt = new TShirt();
        tShirt.wear();
        tShirt.material();
        tShirt.size();
        tShirt.brand();
        tShirt.design();
    }
}
