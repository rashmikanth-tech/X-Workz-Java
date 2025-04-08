package casting;

public class TamilNaduParentDetails extends TamilNaduParent {
    @Override
    public void countryInfo() {
        System.out.println("Overridden: countryInfo in TamilNaduParentDetails");
    }

    @Override
    public void stateAnimal() {
        System.out.println("Overridden: stateAnimal in TamilNaduParentDetails");
    }

    @Override
    public void stateBird() {
        System.out.println("Overridden: stateBird in TamilNaduParentDetails");
    }

    @Override
    public void stateSport() {
        System.out.println("Overridden: stateSport in TamilNaduParentDetails");
    }

    @Override
    public void stateFlower() {
        System.out.println("Overridden: stateFlower in TamilNaduParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in TamilNaduParentDetails");
    }
}
