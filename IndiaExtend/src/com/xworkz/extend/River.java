package com.xworkz.extend;

public class River extends RiverParent {

    @Override
    void category() {
        System.out.println("Overridden: A river is a natural flowing watercourse, usually freshwater, flowing towards an ocean, sea, lake, or another river.");
    }

    @Override
    void longestRiver() {
        System.out.println("Overridden: The Nile is traditionally known as the longest river in the world, stretching over 6,650 km through northeastern Africa.");
    }

    @Override
    void deepestRiver() {
        System.out.println("Overridden: The Congo River in Africa is the world's deepest river, with depths reaching over 220 meters.");
    }

    @Override
    void riverSource() {
        System.out.println("Overridden: The Nile River originates from Lake Victoria, which is shared by Uganda, Kenya, and Tanzania.");
    }

    @Override
    void riverMouth() {
        System.out.println("Overridden: The Nile River empties into the Mediterranean Sea, forming a large delta in northern Egypt.");
    }
}
