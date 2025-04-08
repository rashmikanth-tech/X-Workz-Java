package casting;

public class OdishaParentDetails extends OdishaParent {
    @Override
    public void countryInfo() {
        System.out.println("Overridden: countryInfo in OdishaParentDetails");
    }

    @Override
    public void stateAnimal() {
        System.out.println("Overridden: stateAnimal in OdishaParentDetails");
    }

    @Override
    public void stateBird() {
        System.out.println("Overridden: stateBird in OdishaParentDetails");
    }

    @Override
    public void stateSport() {
        System.out.println("Overridden: stateSport in OdishaParentDetails");
    }

    @Override
    public void stateFlower() {
        System.out.println("Overridden: stateFlower in OdishaParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in OdishaParentDetails");
    }
}
