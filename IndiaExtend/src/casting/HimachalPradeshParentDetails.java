package casting;

public class HimachalPradeshParentDetails extends HimachalPradeshParent {
    @Override
    public void countryInfo() {
        System.out.println("Overridden: countryInfo in HimachalPradeshParentDetails");
    }

    @Override
    public void stateAnimal() {
        System.out.println("Overridden: stateAnimal in HimachalPradeshParentDetails");
    }

    @Override
    public void stateBird() {
        System.out.println("Overridden: stateBird in HimachalPradeshParentDetails");
    }

    @Override
    public void stateSport() {
        System.out.println("Overridden: stateSport in HimachalPradeshParentDetails");
    }

    @Override
    public void stateFlower() {
        System.out.println("Overridden: stateFlower in HimachalPradeshParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in HimachalPradeshParentDetails");
    }
}
