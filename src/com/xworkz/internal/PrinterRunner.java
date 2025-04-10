package com.xworkz.internal;

public class PrinterRunner {
    public static void main(String[] args) {
        Printer printer = new Printer(76, "SizeVal", 17);
        System.out.println(printer);

        Printer printer1 = new Printer(76, "SizeVal", 17);
        int ref = printer1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
