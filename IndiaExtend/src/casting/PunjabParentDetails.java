package casting;

public class PunjabParentDetails extends PunjabParent {
    @Override
    public void countryInfo() {
        System.out.println("Overridden: countryInfo in PunjabParentDetails");
    }

    @Override
    public void stateAnimal() {
        System.out.println("Overridden: stateAnimal in PunjabParentDetails");
    }

    @Override
    public void stateBird() {
        System.out.println("Overridden: stateBird in PunjabParentDetails");
    }

    @Override
    public void stateSport() {
        System.out.println("Overridden: stateSport in PunjabParentDetails");
    }

    @Override
    public void stateFlower() {
        System.out.println("Overridden: stateFlower in PunjabParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in PunjabParentDetails");
    }
}
