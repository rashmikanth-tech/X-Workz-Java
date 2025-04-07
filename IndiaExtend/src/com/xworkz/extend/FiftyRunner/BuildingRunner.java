package com.xworkz.extend.FiftyRunner;


import com.xworkz.extend.Nagaland;
import com.xworkz.extend.fiftyfold.building.Building;
import com.xworkz.extend.fiftyfold.building.House;

public class BuildingRunner {
    public static void main(String[] args) {
        Building building=new House();
        building.shelter();
        building.structure();
        building.floors();
        building.foundation();

        System.out.println("-----------");
        House house = new House();
        house.shelter();
        house.structure();
        house.floors();
        house.foundation();

        Building building1 = new House();
        building1.shelter();
        building1.structure();
        building1.floors();
        building1.foundation();
    }
}
