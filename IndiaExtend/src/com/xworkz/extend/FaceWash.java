package com.xworkz.extend;

public class FaceWash extends FaceWashParent {

    @Override
    void category() {
        System.out.println("Overridden: Face wash is a basic skincare product used to cleanse the face.");
    }

    @Override
    void keyIngredient() {
        System.out.println("Overridden: Common ingredients include salicylic acid, charcoal, and tea tree oil.");
    }

    @Override
    void benefits() {
        System.out.println("Overridden: Helps remove dirt, oil, and impurities to prevent acne and refresh the skin.");
    }

    @Override
    void usage() {
        System.out.println("Overridden: Apply a small amount to wet skin, massage gently, then rinse off.");
    }

    @Override
    void brands() {
        System.out.println("Overridden: Popular face wash brands include Neutrogena, Himalaya, Cetaphil, and Clean & Clear.");
    }

    void suitableForSkinType() {
        System.out.println("Suitable For: All skin types - oily, dry, sensitive, and combination.");
    }

    void dermatologicallyTested() {
        System.out.println("Dermatologically Tested: Yes, most face washes are tested for safety.");
    }

    void faceWashTypes() {
        System.out.println("Types: Gel-based, Cream-based, Foam, Scrubs.");
    }

    void precautions() {
        System.out.println("Precautions: Avoid contact with eyes; do a patch test before use.");
    }

    void storageTips() {
        System.out.println("Storage: Store in a cool, dry place away from direct sunlight.");
    }
}
