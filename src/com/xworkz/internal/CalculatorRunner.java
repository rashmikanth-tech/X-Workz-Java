package com.xworkz.internal;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(65, 76, 63);
        System.out.println(calculator);

        Calculator calculator1 = new Calculator(65, 76, 63);
        int ref = calculator1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
