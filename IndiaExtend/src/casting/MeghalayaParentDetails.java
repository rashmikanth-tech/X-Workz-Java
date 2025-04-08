package casting;

public class MeghalayaParentDetails extends MeghalayaParent {
    @Override
    public void countryInfo() {
        System.out.println("Overridden: countryInfo in MeghalayaParentDetails");
    }

    @Override
    public void stateAnimal() {
        System.out.println("Overridden: stateAnimal in MeghalayaParentDetails");
    }

    @Override
    public void stateBird() {
        System.out.println("Overridden: stateBird in MeghalayaParentDetails");
    }

    @Override
    public void stateSport() {
        System.out.println("Overridden: stateSport in MeghalayaParentDetails");
    }

    @Override
    public void stateFlower() {
        System.out.println("Overridden: stateFlower in MeghalayaParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in MeghalayaParentDetails");
    }
}
