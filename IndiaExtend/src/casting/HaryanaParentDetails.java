package casting;

public class HaryanaParentDetails extends HaryanaParent {
    @Override
    public void countryInfo() {
        System.out.println("Overridden: countryInfo in HaryanaParentDetails");
    }

    @Override
    public void stateAnimal() {
        System.out.println("Overridden: stateAnimal in HaryanaParentDetails");
    }

    @Override
    public void stateBird() {
        System.out.println("Overridden: stateBird in HaryanaParentDetails");
    }

    @Override
    public void stateSport() {
        System.out.println("Overridden: stateSport in HaryanaParentDetails");
    }

    @Override
    public void stateFlower() {
        System.out.println("Overridden: stateFlower in HaryanaParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in HaryanaParentDetails");
    }
}
