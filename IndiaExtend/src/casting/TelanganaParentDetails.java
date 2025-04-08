package casting;

public class TelanganaParentDetails extends TelanganaParent {
    @Override
    public void countryInfo() {
        System.out.println("Overridden: countryInfo in TelanganaParentDetails");
    }

    @Override
    public void stateAnimal() {
        System.out.println("Overridden: stateAnimal in TelanganaParentDetails");
    }

    @Override
    public void stateBird() {
        System.out.println("Overridden: stateBird in TelanganaParentDetails");
    }

    @Override
    public void stateSport() {
        System.out.println("Overridden: stateSport in TelanganaParentDetails");
    }

    @Override
    public void stateFlower() {
        System.out.println("Overridden: stateFlower in TelanganaParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in TelanganaParentDetails");
    }
}
