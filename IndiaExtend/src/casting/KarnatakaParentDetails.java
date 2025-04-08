package casting;

public class KarnatakaParentDetails extends KarnatakaParent {
    @Override
    public void countryInfo() {
        System.out.println("Overridden: countryInfo in KarnatakaParentDetails");
    }

    @Override
    public void stateAnimal() {
        System.out.println("Overridden: stateAnimal in KarnatakaParentDetails");
    }

    @Override
    public void stateBird() {
        System.out.println("Overridden: stateBird in KarnatakaParentDetails");
    }

    @Override
    public void stateSport() {
        System.out.println("Overridden: stateSport in KarnatakaParentDetails");
    }

    @Override
    public void stateFlower() {
        System.out.println("Overridden: stateFlower in KarnatakaParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in KarnatakaParentDetails");
    }
}
