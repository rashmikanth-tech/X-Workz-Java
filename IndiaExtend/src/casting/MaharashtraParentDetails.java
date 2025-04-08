package casting;

public class MaharashtraParentDetails extends MaharashtraParent {
    @Override
    public void countryInfo() {
        System.out.println("Overridden: countryInfo in MaharashtraParentDetails");
    }

    @Override
    public void stateAnimal() {
        System.out.println("Overridden: stateAnimal in MaharashtraParentDetails");
    }

    @Override
    public void stateBird() {
        System.out.println("Overridden: stateBird in MaharashtraParentDetails");
    }

    @Override
    public void stateSport() {
        System.out.println("Overridden: stateSport in MaharashtraParentDetails");
    }

    @Override
    public void stateFlower() {
        System.out.println("Overridden: stateFlower in MaharashtraParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in MaharashtraParentDetails");
    }
}
