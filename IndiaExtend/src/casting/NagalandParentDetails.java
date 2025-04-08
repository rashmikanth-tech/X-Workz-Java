package casting;

public class NagalandParentDetails extends NagalandParent {
    @Override
    public void countryInfo() {
        System.out.println("Overridden: countryInfo in NagalandParentDetails");
    }

    @Override
    public void stateAnimal() {
        System.out.println("Overridden: stateAnimal in NagalandParentDetails");
    }

    @Override
    public void stateBird() {
        System.out.println("Overridden: stateBird in NagalandParentDetails");
    }

    @Override
    public void stateSport() {
        System.out.println("Overridden: stateSport in NagalandParentDetails");
    }

    @Override
    public void stateFlower() {
        System.out.println("Overridden: stateFlower in NagalandParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in NagalandParentDetails");
    }
}
