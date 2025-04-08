package casting;

public class SupernovaParentDetails extends SupernovaParent {
    @Override
    public void category() {
        System.out.println("Overridden: category in SupernovaParentDetails");
    }

    @Override
    public void typesOfSupernovae() {
        System.out.println("Overridden: typesOfSupernovae in SupernovaParentDetails");
    }

    @Override
    public void supernovaBrightness() {
        System.out.println("Overridden: supernovaBrightness in SupernovaParentDetails");
    }

    @Override
    public void supernovaFormation() {
        System.out.println("Overridden: supernovaFormation in SupernovaParentDetails");
    }

    @Override
    public void elementsFromSupernova() {
        System.out.println("Overridden: elementsFromSupernova in SupernovaParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in SupernovaParentDetails");
    }
}
