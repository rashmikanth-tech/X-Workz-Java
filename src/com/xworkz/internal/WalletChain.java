package com.xworkz.internal;

public class WalletChain {
    private int size;
    private int power;
    private String speed;

    public WalletChain(int size, int power, String speed) {
        this.size = size;
        this.power = power;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "size : " + size + ", " + "power : " + power + ", " + "speed : " + speed;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1082;
    }
}
