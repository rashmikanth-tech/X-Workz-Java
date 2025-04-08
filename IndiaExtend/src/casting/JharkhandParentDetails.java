package casting;

public class JharkhandParentDetails extends JharkhandParent {
    @Override
    public void countryInfo() {
        System.out.println("Overridden: countryInfo in JharkhandParentDetails");
    }

    @Override
    public void stateAnimal() {
        System.out.println("Overridden: stateAnimal in JharkhandParentDetails");
    }

    @Override
    public void stateBird() {
        System.out.println("Overridden: stateBird in JharkhandParentDetails");
    }

    @Override
    public void stateSport() {
        System.out.println("Overridden: stateSport in JharkhandParentDetails");
    }

    @Override
    public void stateFlower() {
        System.out.println("Overridden: stateFlower in JharkhandParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in JharkhandParentDetails");
    }
}
