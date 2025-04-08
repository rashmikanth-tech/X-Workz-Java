package casting;

public class GoaParentDetails extends GoaParent {
    @Override
    public void countryInfo() {
        System.out.println("Overridden: countryInfo in GoaParentDetails");
    }

    @Override
    public void stateAnimal() {
        System.out.println("Overridden: stateAnimal in GoaParentDetails");
    }

    @Override
    public void stateBird() {
        System.out.println("Overridden: stateBird in GoaParentDetails");
    }

    @Override
    public void stateSport() {
        System.out.println("Overridden: stateSport in GoaParentDetails");
    }

    @Override
    public void stateFlower() {
        System.out.println("Overridden: stateFlower in GoaParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in GoaParentDetails");
    }
}
