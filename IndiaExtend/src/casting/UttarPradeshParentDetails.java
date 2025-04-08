package casting;

public class UttarPradeshParentDetails extends UttarPradeshParent {
    @Override
    public void countryInfo() {
        System.out.println("Overridden: countryInfo in UttarPradeshParentDetails");
    }

    @Override
    public void stateAnimal() {
        System.out.println("Overridden: stateAnimal in UttarPradeshParentDetails");
    }

    @Override
    public void stateBird() {
        System.out.println("Overridden: stateBird in UttarPradeshParentDetails");
    }

    @Override
    public void stateSport() {
        System.out.println("Overridden: stateSport in UttarPradeshParentDetails");
    }

    @Override
    public void stateFlower() {
        System.out.println("Overridden: stateFlower in UttarPradeshParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in UttarPradeshParentDetails");
    }
}
