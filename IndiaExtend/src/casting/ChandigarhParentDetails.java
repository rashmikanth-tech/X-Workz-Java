package casting;

public class ChandigarhParentDetails extends ChandigarhParent {
    @Override
    public void countryInfo() {
        System.out.println("Overridden: countryInfo in ChandigarhParentDetails");
    }

    @Override
    public void stateAnimal() {
        System.out.println("Overridden: stateAnimal in ChandigarhParentDetails");
    }

    @Override
    public void stateBird() {
        System.out.println("Overridden: stateBird in ChandigarhParentDetails");
    }

    @Override
    public void stateSport() {
        System.out.println("Overridden: stateSport in ChandigarhParentDetails");
    }

    @Override
    public void stateFlower() {
        System.out.println("Overridden: stateFlower in ChandigarhParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in ChandigarhParentDetails");
    }
}
