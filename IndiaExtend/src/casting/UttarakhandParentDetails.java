package casting;

public class UttarakhandParentDetails extends UttarakhandParent {
    @Override
    public void countryInfo() {
        System.out.println("Overridden: countryInfo in UttarakhandParentDetails");
    }

    @Override
    public void stateAnimal() {
        System.out.println("Overridden: stateAnimal in UttarakhandParentDetails");
    }

    @Override
    public void stateBird() {
        System.out.println("Overridden: stateBird in UttarakhandParentDetails");
    }

    @Override
    public void stateSport() {
        System.out.println("Overridden: stateSport in UttarakhandParentDetails");
    }

    @Override
    public void stateFlower() {
        System.out.println("Overridden: stateFlower in UttarakhandParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in UttarakhandParentDetails");
    }
}
