package casting;

public class GujaratParentDetails extends GujaratParent {
    @Override
    public void countryInfo() {
        System.out.println("Overridden: countryInfo in GujaratParentDetails");
    }

    @Override
    public void stateAnimal() {
        System.out.println("Overridden: stateAnimal in GujaratParentDetails");
    }

    @Override
    public void stateBird() {
        System.out.println("Overridden: stateBird in GujaratParentDetails");
    }

    @Override
    public void stateSport() {
        System.out.println("Overridden: stateSport in GujaratParentDetails");
    }

    @Override
    public void stateFlower() {
        System.out.println("Overridden: stateFlower in GujaratParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in GujaratParentDetails");
    }
}
