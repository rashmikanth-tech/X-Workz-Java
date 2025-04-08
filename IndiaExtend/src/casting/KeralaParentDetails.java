package casting;

public class KeralaParentDetails extends KeralaParent {
    @Override
    public void countryInfo() {
        System.out.println("Overridden: countryInfo in KeralaParentDetails");
    }

    @Override
    public void stateAnimal() {
        System.out.println("Overridden: stateAnimal in KeralaParentDetails");
    }

    @Override
    public void stateBird() {
        System.out.println("Overridden: stateBird in KeralaParentDetails");
    }

    @Override
    public void stateSport() {
        System.out.println("Overridden: stateSport in KeralaParentDetails");
    }

    @Override
    public void stateFlower() {
        System.out.println("Overridden: stateFlower in KeralaParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in KeralaParentDetails");
    }
}
