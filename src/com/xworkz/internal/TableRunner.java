package com.xworkz.internal;

public class TableRunner {
    public static void main(String[] args) {
        Table table = new Table("HeightVal", "SizeVal", "PriceVal");
        System.out.println(table);

        Table table1 = new Table("HeightVal", "SizeVal", "PriceVal");
        int ref = table1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
