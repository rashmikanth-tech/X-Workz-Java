package casting;

public class MadhyaPradeshParentDetails extends MadhyaPradeshParent {
    @Override
    public void countryInfo() {
        System.out.println("Overridden: countryInfo in MadhyaPradeshParentDetails");
    }

    @Override
    public void stateAnimal() {
        System.out.println("Overridden: stateAnimal in MadhyaPradeshParentDetails");
    }

    @Override
    public void stateBird() {
        System.out.println("Overridden: stateBird in MadhyaPradeshParentDetails");
    }

    @Override
    public void stateSport() {
        System.out.println("Overridden: stateSport in MadhyaPradeshParentDetails");
    }

    @Override
    public void stateFlower() {
        System.out.println("Overridden: stateFlower in MadhyaPradeshParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in MadhyaPradeshParentDetails");
    }
}
