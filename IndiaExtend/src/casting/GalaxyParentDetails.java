package casting;

public class GalaxyParentDetails extends GalaxyParent {
    @Override
    public void category() {
        System.out.println("Overridden: category in GalaxyParentDetails");
    }

    @Override
    public void largestGalaxy() {
        System.out.println("Overridden: largestGalaxy in GalaxyParentDetails");
    }

    @Override
    public void galaxyTypes() {
        System.out.println("Overridden: galaxyTypes in GalaxyParentDetails");
    }

    @Override
    public void galaxyFormation() {
        System.out.println("Overridden: galaxyFormation in GalaxyParentDetails");
    }

    @Override
    public void galaxyImportance() {
        System.out.println("Overridden: galaxyImportance in GalaxyParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in GalaxyParentDetails");
    }
}
