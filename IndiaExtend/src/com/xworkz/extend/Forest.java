package com.xworkz.extend;

public class Forest extends ForestParent {

    @Override
    void category() {
        System.out.println("Overridden: A forest is a large area dominated by trees and wildlife.");
    }

    @Override
    void largestForest() {
        System.out.println("Overridden: The Amazon Rainforest is the largest tropical rainforest in the world.");
    }

    @Override
    void biodiversity() {
        System.out.println("Overridden: Forests host more than 80% of the terrestrial species of animals, plants, and fungi.");
    }

    @Override
    void forestArea() {
        System.out.println("Overridden: Forests cover about 31% of the Earth's land surface.");
    }

    @Override
    void forestImportance() {
        System.out.println("Overridden: Forests are vital for oxygen production, climate regulation, and biodiversity.");
    }

    // Additional methods (optional)
    void typesOfForests() {
        System.out.println("Types: Tropical, Temperate, Boreal (Taiga).");
    }

    void deforestationImpact() {
        System.out.println("Impact of Deforestation: Loss of biodiversity, climate change, soil erosion.");
    }

    void forestProducts() {
        System.out.println("Products: Timber, paper, medicine, fruits, resins.");
    }

    void conservationEfforts() {
        System.out.println("Conservation: Reforestation, afforestation, wildlife protection.");
    }

    void forestCoverInIndia() {
        System.out.println("India Forest Cover: Around 24.62% of total geographical area.");
    }
}
