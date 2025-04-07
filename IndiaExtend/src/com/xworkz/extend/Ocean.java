package com.xworkz.extend;

public class Ocean extends OceanParent {

    @Override
    void category() {
        System.out.println("Overridden: Oceans are vast bodies of saltwater that cover about 71% of Earth's surface.");
    }

    @Override
    void largestOcean() {
        System.out.println("Overridden: The Pacific Ocean is the largest and deepest ocean on Earth.");
    }

    @Override
    void averageDepth() {
        System.out.println("Overridden: The average depth of oceans is around 3,970 meters, with some areas much deeper.");
    }

    @Override
    void salinity() {
        System.out.println("Overridden: Ocean water typically has a salinity of about 3.5%, mainly from dissolved salts.");
    }

    @Override
    void famousTrench() {
        System.out.println("Overridden: The Mariana Trench in the Pacific Ocean is the deepest natural trench in the world.");
    }
}
