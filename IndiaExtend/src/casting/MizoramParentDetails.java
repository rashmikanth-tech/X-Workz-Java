package casting;

public class MizoramParentDetails extends MizoramParent {
    @Override
    public void countryInfo() {
        System.out.println("Overridden: countryInfo in MizoramParentDetails");
    }

    @Override
    public void stateAnimal() {
        System.out.println("Overridden: stateAnimal in MizoramParentDetails");
    }

    @Override
    public void stateBird() {
        System.out.println("Overridden: stateBird in MizoramParentDetails");
    }

    @Override
    public void stateSport() {
        System.out.println("Overridden: stateSport in MizoramParentDetails");
    }

    @Override
    public void stateFlower() {
        System.out.println("Overridden: stateFlower in MizoramParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in MizoramParentDetails");
    }
}
