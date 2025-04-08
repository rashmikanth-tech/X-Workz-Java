package casting;

public class RajasthanParentDetails extends RajasthanParent {
    @Override
    public void countryInfo() {
        System.out.println("Overridden: countryInfo in RajasthanParentDetails");
    }

    @Override
    public void stateAnimal() {
        System.out.println("Overridden: stateAnimal in RajasthanParentDetails");
    }

    @Override
    public void stateBird() {
        System.out.println("Overridden: stateBird in RajasthanParentDetails");
    }

    @Override
    public void stateSport() {
        System.out.println("Overridden: stateSport in RajasthanParentDetails");
    }

    @Override
    public void stateFlower() {
        System.out.println("Overridden: stateFlower in RajasthanParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in RajasthanParentDetails");
    }
}
