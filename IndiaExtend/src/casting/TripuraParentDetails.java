package casting;

public class TripuraParentDetails extends TripuraParent {
    @Override
    public void countryInfo() {
        System.out.println("Overridden: countryInfo in TripuraParentDetails");
    }

    @Override
    public void stateAnimal() {
        System.out.println("Overridden: stateAnimal in TripuraParentDetails");
    }

    @Override
    public void stateBird() {
        System.out.println("Overridden: stateBird in TripuraParentDetails");
    }

    @Override
    public void stateSport() {
        System.out.println("Overridden: stateSport in TripuraParentDetails");
    }

    @Override
    public void stateFlower() {
        System.out.println("Overridden: stateFlower in TripuraParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in TripuraParentDetails");
    }
}
