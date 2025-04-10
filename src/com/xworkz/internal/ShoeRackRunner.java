package com.xworkz.internal;

public class ShoeRackRunner {
    public static void main(String[] args) {
        ShoeRack shoeRack = new ShoeRack("VersionVal", 94, "PowerVal");
        System.out.println(shoeRack);

        ShoeRack shoeRack1 = new ShoeRack("VersionVal", 94, "PowerVal");
        int ref = shoeRack1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
