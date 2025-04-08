package casting;

public class WestBengalParentDetails extends WestBengalParent {
    @Override
    public void countryInfo() {
        System.out.println("Overridden: countryInfo in WestBengalParentDetails");
    }

    @Override
    public void stateAnimal() {
        System.out.println("Overridden: stateAnimal in WestBengalParentDetails");
    }

    @Override
    public void stateBird() {
        System.out.println("Overridden: stateBird in WestBengalParentDetails");
    }

    @Override
    public void stateSport() {
        System.out.println("Overridden: stateSport in WestBengalParentDetails");
    }

    @Override
    public void stateFlower() {
        System.out.println("Overridden: stateFlower in WestBengalParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in WestBengalParentDetails");
    }
}
