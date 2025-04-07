package com.xworkz.extend;

public class Bihar extends BiharParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: Bihar is an eastern Indian state with rich historical significance.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: The Gaur, also known as Indian bison, is the state animal of Bihar.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: The House Sparrow, a common and friendly bird, is Bihar's state bird.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: Cricket is widely played and followed in Bihar.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: The Marigold flower is widely used in festivals and rituals in Bihar.");
    }

    void capital() {
        System.out.println("Capital: Patna");
    }

    void language() {
        System.out.println("Language: Hindi (official), Bhojpuri, Maithili, Magahi");
    }

    void population() {
        System.out.println("Population: Over 120 million");
    }

    void famousFood() {
        System.out.println("Famous Food: Litti Chokha, Sattu Paratha, Thekua");
    }

    void touristSpot() {
        System.out.println("Tourist Spot: Bodh Gaya, Nalanda University ruins, Vaishali");
    }
}
