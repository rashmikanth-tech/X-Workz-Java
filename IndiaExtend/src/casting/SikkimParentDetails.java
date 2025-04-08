package casting;

public class SikkimParentDetails extends SikkimParent {
    @Override
    public void countryInfo() {
        System.out.println("Overridden: countryInfo in SikkimParentDetails");
    }

    @Override
    public void stateAnimal() {
        System.out.println("Overridden: stateAnimal in SikkimParentDetails");
    }

    @Override
    public void stateBird() {
        System.out.println("Overridden: stateBird in SikkimParentDetails");
    }

    @Override
    public void stateSport() {
        System.out.println("Overridden: stateSport in SikkimParentDetails");
    }

    @Override
    public void stateFlower() {
        System.out.println("Overridden: stateFlower in SikkimParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in SikkimParentDetails");
    }
}
