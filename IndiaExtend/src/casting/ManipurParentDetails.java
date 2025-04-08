package casting;

public class ManipurParentDetails extends ManipurParent {
    @Override
    public void countryInfo() {
        System.out.println("Overridden: countryInfo in ManipurParentDetails");
    }

    @Override
    public void stateAnimal() {
        System.out.println("Overridden: stateAnimal in ManipurParentDetails");
    }

    @Override
    public void stateBird() {
        System.out.println("Overridden: stateBird in ManipurParentDetails");
    }

    @Override
    public void stateSport() {
        System.out.println("Overridden: stateSport in ManipurParentDetails");
    }

    @Override
    public void stateFlower() {
        System.out.println("Overridden: stateFlower in ManipurParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in ManipurParentDetails");
    }
}
