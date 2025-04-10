package com.xworkz.internal;

public class MapRunner {
    public static void main(String[] args) {
        Map map = new Map(73, "SizeVal", "MaterialVal");
        System.out.println(map);

        Map map1 = new Map(73, "SizeVal", "MaterialVal");
        int ref = map1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
